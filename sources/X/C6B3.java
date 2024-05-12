package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6B3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6B3 extends FrameLayout implements InterfaceC156486Ce {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public C164046cC LJLJJI;
    public OPX LJLJJL;
    public C71799SFv LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public boolean LJLJLLL;
    public TuxIconView LJLL;
    public TuxIconView LJLLI;
    public TuxIconView LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxIconView LJLLL;
    public FrameLayout LJLLLL;
    public View LJLLLLLL;

    public final void LIZLLL() {
        UrlModel urlModel;
        String LIZIZ;
        List<String> list;
        UrlModel avatarThumb;
        List<String> urlList;
        Object obj;
        C71799SFv c71799SFv;
        UrlModel avatarThumb2;
        if (this.LJLJLLL) {
            return;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dss, this, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…w_fake_feed, this, false)");
        this.LJLLLLLL = LLLLIILL.findViewById(R.id.lf1);
        this.LJLIL = LLLLIILL.findViewById(R.id.dz4);
        this.LJLILLLLZI = LLLLIILL.findViewById(R.id.dyn);
        this.LJLJI = LLLLIILL.findViewById(R.id.dy5);
        this.LJLJJI = (C164046cC) LLLLIILL.findViewById(R.id.my0);
        this.LJLJJL = (OPX) LLLLIILL.findViewById(R.id.grh);
        this.LJLJJLL = (C71799SFv) LLLLIILL.findViewById(R.id.hdk);
        this.LJLJL = (TextView) LLLLIILL.findViewById(R.id.mby);
        this.LJLJLJ = (TextView) LLLLIILL.findViewById(R.id.mbi);
        C164046cC c164046cC = this.LJLJJI;
        if (c164046cC != null) {
            c164046cC.setBorderColor(R.color.ar);
        }
        View view = this.LJLIL;
        if (view != null) {
            view.setVisibility(4);
        }
        addView(LLLLIILL);
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser != null) {
            urlModel = currentUser.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (urlModel != null) {
            C164046cC c164046cC2 = this.LJLJJI;
            UrlModel avatarThumb3 = currentUser.getAvatarThumb();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            int LIZIZ2 = (int) C74275TDb.LIZIZ(context, 49.0f);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            C78764Uvg.LJI(c164046cC2, avatarThumb3, LIZIZ2, (int) C74275TDb.LIZIZ(context2, 49.0f));
        } else {
            C78764Uvg.LIZ(this.LJLJJI, R.drawable.b0p);
        }
        TextView textView = this.LJLJL;
        if (textView != null) {
            if (C6DX.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('@');
                C44423Hc3 LJ = C73098SmU.LJ();
                Resources resources = getResources();
                o.LJIIIIZZ(resources, "resources");
                LIZ.append(C41532GRs.LIZIZ(LJ, resources));
                LIZIZ = X1D.LIZIZ(LIZ);
            } else {
                C44423Hc3 LJ2 = C73098SmU.LJ();
                Resources resources2 = getResources();
                o.LJIIIIZZ(resources2, "resources");
                LIZIZ = C41532GRs.LIZIZ(LJ2, resources2);
            }
            textView.setText(LIZIZ);
        }
        if (C6DX.LIZIZ()) {
            TextView textView2 = this.LJLJL;
            if (textView2 != null) {
                textView2.setTextSize(17.0f);
            }
        } else {
            TextView textView3 = this.LJLJL;
            if (textView3 != null) {
                textView3.setTextSize(15.0f);
            }
        }
        if (currentUser != null && (avatarThumb2 = currentUser.getAvatarThumb()) != null) {
            list = avatarThumb2.getUrlList();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty() && currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null && (obj = ListProtector.get(urlList, 0)) != null && (c71799SFv = this.LJLJJLL) != null) {
            C71799SFv.LJIIJ(c71799SFv, obj, null, false, null, 126);
        }
        C78764Uvg.LIZ(this.LJLJJL, R.drawable.b0j);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_music_note_s_alt;
        c2068389v.LIZIZ = C7MY.LIZIZ(14);
        c2068389v.LIZJ = C7MY.LIZIZ(14);
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        SY9 LIZ2 = c2068389v.LIZ(context3);
        LIZ2.setBounds(0, 0, LIZ2.getMinimumWidth(), LIZ2.getMinimumHeight());
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        if (C26338AVi.LIZJ(context4)) {
            TextView textView4 = this.LJLJLJ;
            if (textView4 != null) {
                textView4.setCompoundDrawables(null, null, LIZ2, null);
            }
        } else {
            TextView textView5 = this.LJLJLJ;
            if (textView5 != null) {
                textView5.setCompoundDrawables(LIZ2, null, null, null);
            }
        }
        TextView textView6 = this.LJLJLJ;
        if (textView6 != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("");
            Context context5 = getContext();
            o.LJIIIIZZ(context5, "context");
            LIZ3.append(C41532GRs.LIZ(context5, C60903NvH.LJIIJJI().getAccountService().getCurrentUser()));
            textView6.setText(X1D.LIZIZ(LIZ3));
        }
        this.LJLJLLL = true;
        this.LJLL = (TuxIconView) LLLLIILL.findViewById(R.id.i2s);
        this.LJLLI = (TuxIconView) LLLLIILL.findViewById(R.id.i2p);
        this.LJLLILLLL = (TuxIconView) LLLLIILL.findViewById(R.id.i2t);
        this.LJLLJ = (TuxTextView) LLLLIILL.findViewById(R.id.bke);
        this.LJLLL = (TuxIconView) LLLLIILL.findViewById(R.id.cud);
        this.LJLLLL = (FrameLayout) LLLLIILL.findViewById(R.id.grk);
        float LIZ4 = C6DY.LIZ();
        View view2 = this.LJLLLLLL;
        if (view2 != null) {
            view2.setAlpha(LIZ4);
        }
        C164046cC c164046cC3 = this.LJLJJI;
        if (c164046cC3 != null) {
            c164046cC3.setAlpha(LIZ4);
        }
        TuxIconView tuxIconView = this.LJLL;
        if (tuxIconView != null) {
            tuxIconView.setAlpha(LIZ4);
        }
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 != null) {
            tuxIconView2.setAlpha(LIZ4);
        }
        TuxIconView tuxIconView3 = this.LJLLILLLL;
        if (tuxIconView3 != null) {
            tuxIconView3.setAlpha(LIZ4);
        }
        TuxTextView tuxTextView = this.LJLLJ;
        if (tuxTextView != null) {
            tuxTextView.setAlpha(LIZ4);
        }
        TextView textView7 = this.LJLJL;
        if (textView7 != null) {
            textView7.setAlpha(LIZ4);
        }
        TextView textView8 = this.LJLJLJ;
        if (textView8 != null) {
            textView8.setAlpha(LIZ4);
        }
        TuxIconView tuxIconView4 = this.LJLLL;
        if (tuxIconView4 != null) {
            tuxIconView4.setAlpha(LIZ4);
        }
        FrameLayout frameLayout = this.LJLLLL;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setAlpha(LIZ4);
    }

    @Override // X.InterfaceC156486Ce
    public View getContentView() {
        LIZLLL();
        return this;
    }

    public final View getGradualMaskBottom() {
        return this.LJLJI;
    }

    public final View getGroupBottomLine() {
        return this.LJLILLLLZI;
    }

    public final View getGroupRightLine() {
        return this.LJLIL;
    }

    public final boolean getHasInit() {
        return this.LJLJLLL;
    }

    public final C71799SFv getIvOriginMusicCover() {
        return this.LJLJJLL;
    }

    public final C164046cC getMAvatarView() {
        return this.LJLJJI;
    }

    public final OPX getMMusicCoverView() {
        return this.LJLJJL;
    }

    public final TextView getTvMusic() {
        return this.LJLJLJ;
    }

    public final TextView getTvName() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6B3(Context context) {
        super(context);
        a1.LJFF(context, "context");
    }

    @Override // X.InterfaceC156486Ce
    public final void LIZ(boolean z) {
        int i;
        LIZLLL();
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC156486Ce
    public final void LIZIZ(boolean z) {
        int i;
        LIZLLL();
        View view = this.LJLLLLLL;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC156486Ce
    public final void LIZJ(boolean z) {
        LIZLLL();
        View view = this.LJLJI;
        int i = 0;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 == null) {
            return;
        }
        if (!z) {
            i = 4;
        }
        view2.setVisibility(i);
    }

    public final void setGradualMaskBottom(View view) {
        this.LJLJI = view;
    }

    public final void setGroupBottomLine(View view) {
        this.LJLILLLLZI = view;
    }

    public final void setGroupRightLine(View view) {
        this.LJLIL = view;
    }

    public final void setHasInit(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setIvOriginMusicCover(C71799SFv c71799SFv) {
        this.LJLJJLL = c71799SFv;
    }

    public final void setMAvatarView(C164046cC c164046cC) {
        this.LJLJJI = c164046cC;
    }

    public final void setMMusicCoverView(OPX opx) {
        this.LJLJJL = opx;
    }

    public final void setTvMusic(TextView textView) {
        this.LJLJLJ = textView;
    }

    public final void setTvName(TextView textView) {
        this.LJLJL = textView;
    }
}
