package X;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.62N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62N extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public LinearLayout LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public C62Q LJLJL;
    public C62Q LJLJLJ;

    static {
        TBT tbt = new TBT(C62N.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C62N.class, "nowEditPreviewApi", "getNowEditPreviewApi()Lcom/ss/android/ugc/aweme/nows/preview/NowsEditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C62N.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public final InterfaceC153275zv LLJILJIL() {
        return (InterfaceC153275zv) this.LJLJI.LIZ(this, LJLJLLL[0]);
    }

    public final VideoPublishEditModel LLJILJILJ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLJLLL[2]);
    }

    public final void LLJJ() {
        boolean z;
        UrlModel urlModel;
        W5F LJII;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LLJILJILJ().creativeModel.musicBuzModel);
        final C62Q c62q = this.LJLJL;
        if (c62q != null) {
            if (extractAVMusic != null && extractAVMusic.isLocalMusic()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                urlModel = C62Q.LJLL;
            } else if (extractAVMusic != null) {
                urlModel = extractAVMusic.coverThumb;
            } else {
                urlModel = null;
            }
            if (urlModel == null) {
                C72434Sbm c72434Sbm = c62q.LJLILLLLZI;
                if (c72434Sbm != null) {
                    c72434Sbm.setVisibility(8);
                    SmartImageView smartImageView = c62q.LJLIL;
                    if (smartImageView != null) {
                        smartImageView.setVisibility(0);
                        ValueAnimator valueAnimator = c62q.LJLJL;
                        if (valueAnimator != null) {
                            valueAnimator.pause();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("toolIv");
                    throw null;
                }
                o.LJIJI("musicCover");
                throw null;
            }
            C72434Sbm c72434Sbm2 = c62q.LJLILLLLZI;
            if (c72434Sbm2 != null) {
                c72434Sbm2.setVisibility(0);
                if (o.LJ(urlModel, C62Q.LJLL)) {
                    LJII = W5U.LJ(R.drawable.bo7);
                } else {
                    LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                }
                int i = c62q.LJLJJL;
                int i2 = c62q.LJLJJLL;
                LJII.LJII = i;
                LJII.LJIIIIZZ = i2;
                LJII.LJJIJIIJIL = true;
                LJII.LIZIZ("NowEditToolbarItem");
                C72434Sbm c72434Sbm3 = c62q.LJLILLLLZI;
                if (c72434Sbm3 != null) {
                    LJII.LJJIIJ = c72434Sbm3;
                    LJII.LJJIZ = new SIR() { // from class: X.62R
                        @Override // X.SIR
                        public final void LIZ(JSONObject jSONObject) {
                            C2VQ.LIZIZ(new AqS152S0100000_2(C62Q.this, 138), 0L);
                        }

                        @Override // X.SIR
                        public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z2) {
                            C2VQ.LIZIZ(new AqS152S0100000_2(C62Q.this, 137), 0L);
                        }
                    };
                    C16880lQ.LLJJJ(LJII);
                    return;
                }
                o.LJIJI("musicCover");
                throw null;
            }
            o.LJIJI("musicCover");
            throw null;
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C62N(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC142595ih.class, null);
        this.LJLJJL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 136));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0183, code lost:
    
        if (X.C43119Gw7.LIZ() != false) goto L29;
     */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62N.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdr, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
