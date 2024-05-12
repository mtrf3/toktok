package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9V extends ESP implements TGM {
    public final C29S LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;
    public final ShortVideoContext LJLJJI;
    public Effect LJLJJL;
    public View LJLJJLL;
    public InterfaceC82683Wch LJLJL;

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.ESP
    public final void LJIIJJI() {
    }

    @Override // X.TGM
    public final void LJI() {
        InterfaceC82683Wch interfaceC82683Wch;
        InterfaceC82683Wch interfaceC82683Wch2 = this.LJLJL;
        if (interfaceC82683Wch2 != null && interfaceC82683Wch2.isShowing() && (interfaceC82683Wch = this.LJLJL) != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLJJLL = stickerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (X.ID0.LJIIZILJ(r3.LJLJJL) != false) goto L4;
     */
    @Override // X.ESP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ(X.T4Q r4) {
        /*
            r3 = this;
            java.lang.String r0 = "session"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4.LIZ
            r3.LJLJJL = r0
            int r0 = r4.LIZIZ
            r1 = 1
            if (r0 > 0) goto L12
        Le:
            r2 = 1
        Lf:
            r0 = r2 ^ 1
            return r0
        L12:
            X.Pro<java.lang.Boolean> r0 = r3.LJLJI
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            goto Le
        L21:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LJLJJL
            if (r0 != 0) goto L26
            goto Le
        L26:
            boolean r0 = r0.isBusiness()
            r2 = 0
            if (r0 != r1) goto Le
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LJLJJL
            boolean r0 = X.V3N.LJIILLIIL(r0)
            if (r0 == 0) goto L36
            goto Le
        L36:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.LJLJJI
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r0 != 0) goto L43
            goto Le
        L43:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LJLJJL
            if (r0 == 0) goto L64
            java.util.List r0 = r0.getMusic()
            if (r0 == 0) goto L64
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L64
        L53:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LJLJJL
            if (r0 == 0) goto L62
            java.lang.String r0 = r0.getParentId()
        L5b:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L77
            goto Le
        L62:
            r0 = 0
            goto L5b
        L64:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.LJLJJI
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r0 == 0) goto Le
            boolean r0 = r0.isShouldShowCommerceTips()
            if (r0 != r1) goto Le
            goto L53
        L77:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LJLJJL
            boolean r0 = X.ID0.LJIIZILJ(r0)
            if (r0 == 0) goto Lf
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9V.LJIIJ(X.T4Q):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        int i;
        ViewPager viewPager;
        TH0 th0;
        java.util.Map<Integer, InterfaceC74377TGz<Fragment>> map;
        InterfaceC74377TGz interfaceC74377TGz;
        View view;
        RecyclerView recyclerView;
        C0A2 layoutManager;
        View LJJIJIL;
        float LIZIZ;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        this.LJLJJL = effect;
        if (V3N.LJJII(effect)) {
            i = R.string.ifx;
        } else {
            i = R.string.ify;
        }
        View view2 = this.LJLJJLL;
        PagerAdapter pagerAdapter = null;
        if (view2 != null) {
            viewPager = (ViewPager) view2.findViewById(R.id.nd5);
            if (viewPager != null) {
                pagerAdapter = viewPager.getAdapter();
            }
        } else {
            viewPager = null;
        }
        if ((pagerAdapter instanceof TH0) && (th0 = (TH0) pagerAdapter) != null && (map = th0.LJLLILLLL) != null && (interfaceC74377TGz = (InterfaceC74377TGz) map.get(Integer.valueOf(viewPager.getCurrentItem()))) != 0) {
            interfaceC74377TGz.N7();
            Fragment fragment = (Fragment) interfaceC74377TGz;
            if (fragment == null || (view = fragment.getView()) == null || (recyclerView = (RecyclerView) view.findViewById(R.id.kie)) == null || (layoutManager = recyclerView.getLayoutManager()) == null || (LJJIJIL = layoutManager.LJJIJIL(session.LIZIZ)) == null) {
                return;
            }
            int i2 = session.LIZIZ % 5;
            if (i2 == 1 || i2 == 2) {
                LIZIZ = C74275TDb.LIZIZ(this.LJLILLLLZI, 12.0f);
            } else {
                LIZIZ = C74275TDb.LIZIZ(this.LJLILLLLZI, 22.0f);
            }
            Context context = LJJIJIL.getContext();
            o.LJIIIIZZ(context, "stickerImageView.context");
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LJI(WHL.TOP);
            C82682Wcg c82682Wcg = c139825eE.LIZ;
            c82682Wcg.LIZIZ = LJJIJIL;
            c82682Wcg.LJII = 3000L;
            c139825eE.LJIIJJI(i);
            c139825eE.LIZ.LJIIIIZZ = (int) LIZIZ;
            c139825eE.LJIIJ(new ACListenerS27S0100000_7(this, 173), true);
            InterfaceC82683Wch LIZJ = c139825eE.LIZJ();
            this.LJLJL = LIZJ;
            LIZJ.show();
        }
    }

    public I9V(C29S activity, AqS157S0100000_7 aqS157S0100000_7, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLILLLLZI = activity;
        this.LJLJI = aqS157S0100000_7;
        this.LJLJJI = shortVideoContext;
    }
}
