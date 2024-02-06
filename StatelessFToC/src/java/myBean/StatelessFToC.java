package myBean;

import javax.ejb.Stateless;

@Stateless
public class StatelessFToC implements StatelessFToCRemote {

    @Override
    public double fToC(double f) {
        return (f - 32) * 5 / 7;
    }
}
