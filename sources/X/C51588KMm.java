package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import o53.IDdS475S0100000_8;

/* renamed from: X.KMm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51588KMm extends C62846OlW {
    public C81392Vwy<Bitmap> LJLIL;
    public UrlModel LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final IDdS475S0100000_8 LJLJJLL;

    @Override // X.C62846OlW
    public void LIZ() {
    }

    public String getUrl() {
        UrlModel urlModel = this.LJLILLLLZI;
        if (urlModel == null || urlModel.getUrlList() == null || this.LJLILLLLZI.getUrlList().size() == 0) {
            return "";
        }
        return (String) ListProtector.get(this.LJLILLLLZI.getUrlList(), 0);
    }

    public final void LIZIZ() {
        Animatable LIZ;
        if (getController() != null && this.LJLJI && this.LJLJJI && this.LJLJJL && (LIZ = getController().LIZ()) != null && !LIZ.isRunning()) {
            LIZ.start();
        }
    }

    public W4Z<InterfaceC81599W0t> getControllerListener() {
        return this.LJLJJLL;
    }

    public C51588KMm(Context context) {
        super(context);
        this.LJLJJLL = new IDdS475S0100000_8(this, 1);
        LIZ();
    }

    public void setAttached(boolean z) {
        this.LJLJI = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.LJLJJL = z;
    }

    public C51588KMm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJLL = new IDdS475S0100000_8(this, 1);
        LIZ();
    }
}
