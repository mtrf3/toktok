package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4R2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4R2 extends RecyclerView.ViewHolder implements C4QS {
    public static final /* synthetic */ int LJLL = 0;
    public SharePanelViewModel LJLIL;
    public final boolean LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public boolean LJLJLJ;
    public String LJLJLLL;

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
    }

    public final C71799SFv M() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-avatarIv>(...)");
        return (C71799SFv) value;
    }

    public final TuxIconView N() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-iconPlus>(...)");
        return (TuxIconView) value;
    }

    public final TuxTextView P() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-tvTitle>(...)");
        return (TuxTextView) value;
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        String str;
        if (this.LJLJLJ) {
            return;
        }
        Aweme LJJJLL = C4LD.LIZ.LJJJLL(this.LJLIL.LJLIL);
        if (LJJJLL == null) {
            return;
        }
        if (this.LJLILLLLZI) {
            str = "long_press";
        } else {
            str = "click_share_button";
        }
        ((GZP) this.LJLJL.getValue()).LJIIJ("share_to_story_show", LJJJLL, new AqS55S1100000_1(this, str, 15));
        this.LJLJLJ = true;
    }

    public final void L(IMContact contact, SharePanelViewModel newViewModel) {
        UrlModel urlModel;
        Bundle bundle;
        String str;
        o.LJIIIZ(contact, "contact");
        o.LJIIIZ(newViewModel, "newViewModel");
        java.util.Set<IMContact> LJIIIIZZ = this.LJLIL.LJIIIIZZ();
        if (LJIIIIZZ == null || LJIIIIZZ.isEmpty()) {
            M().setAlpha(1.0f);
            P().setAlpha(1.0f);
            N().setImageAlpha(255);
        } else {
            M().setAlpha(0.34f);
            P().setAlpha(0.34f);
            N().setImageAlpha(86);
        }
        this.LJLIL = newViewModel;
        User user = newViewModel.LL;
        if (user != null) {
            urlModel = user.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (this.LJLILLLLZI) {
            if (((Boolean) L1L.LIZLLL.getValue()).booleanValue()) {
                if (urlModel != null) {
                    C71799SFv.LJIIJ(M(), C78939UyV.LJ(urlModel), null, false, null, 126);
                } else {
                    C71799SFv.LJIIJ(M(), Integer.valueOf(R.raw.icon_color_default_avatar), null, false, null, 126);
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_plus_now;
                c2068389v.LJ = Integer.valueOf(R.attr.eg);
                c2068389v.LIZIZ = C7MY.LIZIZ(16);
                c2068389v.LIZJ = C7MY.LIZIZ(16);
                SY9 LIZJ = C025908h.LIZJ(this.itemView, "itemView.context", c2068389v);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LJII = C7MY.LIZIZ(20);
                c110614Vt.LJI = C7MY.LIZIZ(20);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
                c110614Vt.LIZJ = Float.valueOf(Float.MAX_VALUE);
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                N().setImageDrawable(C26338AVi.LJIIJ(LIZJ, c110614Vt.LIZ(context)));
                N().setVisibility(0);
                this.LJLJLLL = "avatar_story_icon";
            } else {
                C71799SFv M = M();
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_color_story_circle;
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                M.setImageDrawable(c2068389v2.LIZ(context2));
                this.LJLJLLL = "default_story_icon";
            }
            C1DG.LJI(this.itemView, R.string.r5w, P());
            Object value = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value, "<get-rootLayout>(...)");
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(contact, this, 91), (View) value);
        } else {
            if (urlModel != null) {
                C71799SFv.LJIIJ(M(), C78939UyV.LJ(urlModel), null, false, null, 126);
            } else {
                C71799SFv.LJIIJ(M(), Integer.valueOf(R.raw.icon_color_default_avatar), null, false, null, 126);
            }
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_plus_now;
            c2068389v3.LJ = Integer.valueOf(R.attr.eg);
            c2068389v3.LIZIZ = C7MY.LIZIZ(18);
            c2068389v3.LIZJ = C7MY.LIZIZ(18);
            SY9 LIZJ2 = C025908h.LIZJ(this.itemView, "itemView.context", c2068389v3);
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LJII = C7MY.LIZIZ(24);
            c110614Vt2.LJI = C7MY.LIZIZ(24);
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cl);
            c110614Vt2.LIZJ = Float.valueOf(Float.MAX_VALUE);
            Drawable LIZ = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt2);
            N().setImageDrawable(LIZJ2);
            N().setBackground(LIZ);
            if (!this.LJLIL.LJIIIIZZ().isEmpty()) {
                C16880lQ.LJIIJ(null, this.itemView);
                this.itemView.setClickable(false);
            } else {
                C16880lQ.LJIIJ(new ACListenerS36S0200000_1(contact, this, 92), this.itemView);
                this.itemView.setClickable(true);
            }
            P().setText(this.itemView.getContext().getText(R.string.r5w));
            this.LJLJLLL = "avatar_story_icon";
        }
        SharePackage sharePackage = this.LJLIL.LJLIL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            bundle.putString("share_to_story_entrance_icon", this.LJLJLLL);
            if (this.LJLILLLLZI) {
                str = "long_press";
            } else {
                str = "click_share_button";
            }
            bundle.putString("share_to_story_enter_method", str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4R2(View view, SharePanelViewModel viewModel, boolean z) {
        super(view);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = z;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1040));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1041));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1043));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 1042));
        this.LJLJL = C221108m2.LIZIZ(C4R3.LJLIL);
        this.LJLJLLL = "";
    }
}
