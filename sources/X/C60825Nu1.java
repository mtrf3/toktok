package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Nu1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60825Nu1 extends AbstractC60811Ntn {
    public AbstractC60811Ntn LJLILLLLZI;
    public boolean LJLJI;

    public C60825Nu1() {
        this(0);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJL() {
        AbstractC60811Ntn abstractC60811Ntn;
        if (!this.LJLJI && (abstractC60811Ntn = this.LJLILLLLZI) != null) {
            abstractC60811Ntn.LJJJJL();
        }
    }

    public C60825Nu1(int i) {
        this.LJLILLLLZI = null;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        AbstractC60811Ntn abstractC60811Ntn;
        o.LJIIIZ(view, "view");
        if (!this.LJLJI && (abstractC60811Ntn = this.LJLILLLLZI) != null) {
            abstractC60811Ntn.LJJJJJ(view);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        AbstractC60811Ntn abstractC60811Ntn;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        if (!this.LJLJI && (abstractC60811Ntn = this.LJLILLLLZI) != null) {
            abstractC60811Ntn.LJJJJJL(view, url);
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLZIJ(SparkContext sparkContext, C0D5 c0d5) {
        AbstractC60811Ntn abstractC60811Ntn;
        if (!this.LJLJI && (abstractC60811Ntn = this.LJLILLLLZI) != null) {
            abstractC60811Ntn.LJJJLZIJ(sparkContext, c0d5);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        AbstractC60811Ntn abstractC60811Ntn;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        if (!this.LJLJI && (abstractC60811Ntn = this.LJLILLLLZI) != null) {
            abstractC60811Ntn.LJJJJIZL(view, url, c60704Ns4);
        }
    }
}
