package myBean;

import javax.ejb.Remote;

@Remote
public interface StatelessFToCRemote {
    public double fToC(double f);
}
