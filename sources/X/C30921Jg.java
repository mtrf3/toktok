package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.simkit.impl.player.SurfaceViewHolder;
import com.ss.android.ugc.aweme.simkit.impl.player.TextureViewHolder;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: X.1Jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30921Jg implements InterfaceC153055zZ, InterfaceC47522Ikw {
    public final Object LJLIL;

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        return new C37109EhN((Context) ((InterfaceC153055zZ) this.LJLIL).a());
    }

    public final InterfaceC47258Igg LIZIZ() {
        InterfaceC47258Igg LIZLLL = LIZLLL(Boolean.FALSE);
        C16880lQ.LLLZ("create: holder:%s, total:%s", new Object[]{LIZLLL, Integer.valueOf(((WeakHashMap) this.LJLIL).size())});
        return LIZLLL;
    }

    public final void LJFF() {
        Iterator it = ((WeakHashMap) this.LJLIL).keySet().iterator();
        while (it.hasNext()) {
            InterfaceC47258Igg relatedSurfaceHolder = ((J9X) it.next()).getRelatedSurfaceHolder();
            if (relatedSurfaceHolder != null) {
                relatedSurfaceHolder.release();
            }
        }
        ((WeakHashMap) this.LJLIL).clear();
    }

    @Override // X.InterfaceC47522Ikw
    public final boolean clear() {
        C0FS.LIZIZ(this.LJLIL);
        return false;
    }

    @Override // X.InterfaceC47522Ikw
    public final boolean LIZ(String str) {
        C0FS.LIZIZ(this.LJLIL);
        return false;
    }

    public final InterfaceC47258Igg LIZJ(Boolean bool) {
        InterfaceC47258Igg LIZLLL = LIZLLL(bool);
        C16880lQ.LLLZ("create: holder:%s, total:%s", new Object[]{LIZLLL, Integer.valueOf(((WeakHashMap) this.LJLIL).size())});
        return LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC47258Igg LIZLLL(Boolean bool) {
        InterfaceC47258Igg textureViewHolder;
        J9Y j9y;
        if ((!C1DG.LIZ().getConfig().getPlayerGlobalConfig().isUseSurfaceView()) || bool.booleanValue()) {
            J9Y j9y2 = new J9Y(C46982IcE.LIZ);
            j9y2.setTag("VIDEO_VIEW_TAG");
            textureViewHolder = new TextureViewHolder(j9y2);
            j9y = j9y2;
        } else {
            J9V j9v = new J9V(C46982IcE.LIZ);
            j9v.setTag("VIDEO_VIEW_TAG");
            textureViewHolder = new SurfaceViewHolder(j9v);
            j9y = j9v;
        }
        ((WeakHashMap) this.LJLIL).put(j9y, "SurfaceHolderFactory");
        return textureViewHolder;
    }

    public final InterfaceC47258Igg LJ(View view) {
        for (J9X j9x : ((WeakHashMap) this.LJLIL).keySet()) {
            if (j9x == view) {
                return j9x.getRelatedSurfaceHolder();
            }
        }
        return null;
    }

    @Override // X.InterfaceC47522Ikw
    public final String getString(String str) {
        C0FS.LIZIZ(this.LJLIL);
        return "";
    }

    public /* synthetic */ C30921Jg(InterfaceC153055zZ interfaceC153055zZ) {
        this.LJLIL = interfaceC153055zZ;
    }

    @Override // X.InterfaceC47522Ikw
    public final boolean putString(String str, String str2) {
        C0FS.LIZIZ(this.LJLIL);
        return false;
    }
}
