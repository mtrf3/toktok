package X;

import Y.ARunnableS43S0100000_7;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.GRr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41531GRr extends FrameLayout {
    public C164046cC LJLIL;
    public OPX LJLILLLLZI;
    public C71799SFv LJLJI;
    public TextView LJLJJI;
    public TuxTag LJLJJL;
    public C8H9 LJLJJLL;
    public C89K LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public LinearLayout LJLL;
    public SmartImageView LJLLI;
    public TextView LJLLILLLL;
    public LinearLayout LJLLJ;
    public TextView LJLLL;
    public TuxTag LJLLLL;
    public ConstraintLayout LJLLLLLL;
    public LinearLayout LJLZ;
    public View LJZ;
    public TuxIconView LJZI;
    public TuxIconView LJZL;
    public TuxIconView LL;
    public ViewGroup LLD;
    public FrameLayout LLF;
    public final C62822Ol8 LLFF;

    private final Handler getUiHandler() {
        return (Handler) this.LLFF.getValue();
    }

    public final SmartImageView getAnchorIcon() {
        SmartImageView smartImageView = this.LJLLI;
        if (smartImageView != null) {
            return smartImageView;
        }
        o.LJIJI("anchorIcon");
        throw null;
    }

    public final LinearLayout getAnchorLayout() {
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("anchorLayout");
        throw null;
    }

    public final TextView getAnchorText() {
        TextView textView = this.LJLLILLLL;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("anchorText");
        throw null;
    }

    public final ConstraintLayout getBottomTab() {
        ConstraintLayout constraintLayout = this.LJLLLLLL;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o.LJIJI("bottomTab");
        throw null;
    }

    public final View getItemView() {
        View view = this.LJZ;
        if (view != null) {
            return view;
        }
        o.LJIJI("itemView");
        throw null;
    }

    public final C71799SFv getIvOriginMusicCover() {
        C71799SFv c71799SFv = this.LJLJI;
        if (c71799SFv != null) {
            return c71799SFv;
        }
        o.LJIJI("ivOriginMusicCover");
        throw null;
    }

    public final LinearLayout getLeftBottomContent() {
        LinearLayout linearLayout = this.LJLZ;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("leftBottomContent");
        throw null;
    }

    public final C164046cC getMAvatarView() {
        C164046cC c164046cC = this.LJLIL;
        if (c164046cC != null) {
            return c164046cC;
        }
        o.LJIJI("mAvatarView");
        throw null;
    }

    public final OPX getMMusicCoverView() {
        OPX opx = this.LJLILLLLZI;
        if (opx != null) {
            return opx;
        }
        o.LJIJI("mMusicCoverView");
        throw null;
    }

    public final LinearLayout getPermissionLL() {
        LinearLayout linearLayout = this.LJLLJ;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("permissionLL");
        throw null;
    }

    public final TuxTag getPermissionTag() {
        TuxTag tuxTag = this.LJLLLL;
        if (tuxTag != null) {
            return tuxTag;
        }
        o.LJIJI("permissionTag");
        throw null;
    }

    public final TextView getPreviewTitle() {
        TextView textView = this.LJLLL;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("previewTitle");
        throw null;
    }

    public final C89K getTvDescription() {
        C89K c89k = this.LJLJL;
        if (c89k != null) {
            return c89k;
        }
        o.LJIJI("tvDescription");
        throw null;
    }

    public final C8H9 getTvMusic() {
        C8H9 c8h9 = this.LJLJJLL;
        if (c8h9 != null) {
            return c8h9;
        }
        o.LJIJI("tvMusic");
        throw null;
    }

    public final TextView getTvName() {
        TextView textView = this.LJLJJI;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("tvName");
        throw null;
    }

    public final TuxTag getTvSocialVideoTagged() {
        TuxTag tuxTag = this.LJLJJL;
        if (tuxTag != null) {
            return tuxTag;
        }
        o.LJIJI("tvSocialVideoTagged");
        throw null;
    }

    public final TuxTextView getTvTitle() {
        TuxTextView tuxTextView = this.LJLJLJ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("tvTitle");
        throw null;
    }

    public final TuxTextView getTvToggle() {
        TuxTextView tuxTextView = this.LJLJLLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("tvToggle");
        throw null;
    }

    public final void LIZIZ() {
        getUiHandler().post(new ARunnableS43S0100000_7(this, 50));
    }

    public final float getBottomMarginForCaptionSticker() {
        return getHeight() - getLeftBottomContent().getTop();
    }

    public final void setAnchorIcon(SmartImageView smartImageView) {
        o.LJIIIZ(smartImageView, "<set-?>");
        this.LJLLI = smartImageView;
    }

    public final void setAnchorLayout(LinearLayout linearLayout) {
        o.LJIIIZ(linearLayout, "<set-?>");
        this.LJLL = linearLayout;
    }

    public final void setAnchorText(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLLILLLL = textView;
    }

    public final void setBottomMargin(int i) {
        ViewGroup.LayoutParams layoutParams = getItemView().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i;
        getItemView().setLayoutParams(layoutParams2);
    }

    public final void setBottomTab(ConstraintLayout constraintLayout) {
        o.LJIIIZ(constraintLayout, "<set-?>");
        this.LJLLLLLL = constraintLayout;
    }

    public final void setItemView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJZ = view;
    }

    public final void setIvOriginMusicCover(C71799SFv c71799SFv) {
        o.LJIIIZ(c71799SFv, "<set-?>");
        this.LJLJI = c71799SFv;
    }

    public final void setLeftBottomContent(LinearLayout linearLayout) {
        o.LJIIIZ(linearLayout, "<set-?>");
        this.LJLZ = linearLayout;
    }

    public final void setMAvatarView(C164046cC c164046cC) {
        o.LJIIIZ(c164046cC, "<set-?>");
        this.LJLIL = c164046cC;
    }

    public final void setMMusicCoverView(OPX opx) {
        o.LJIIIZ(opx, "<set-?>");
        this.LJLILLLLZI = opx;
    }

    public final void setPermissionLL(LinearLayout linearLayout) {
        o.LJIIIZ(linearLayout, "<set-?>");
        this.LJLLJ = linearLayout;
    }

    public final void setPermissionTag(TuxTag tuxTag) {
        o.LJIIIZ(tuxTag, "<set-?>");
        this.LJLLLL = tuxTag;
    }

    public final void setPreviewTitle(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLLL = textView;
    }

    public final void setTvDescription(C89K c89k) {
        o.LJIIIZ(c89k, "<set-?>");
        this.LJLJL = c89k;
    }

    public final void setTvMusic(C8H9 c8h9) {
        o.LJIIIZ(c8h9, "<set-?>");
        this.LJLJJLL = c8h9;
    }

    public final void setTvName(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLJJI = textView;
    }

    public final void setTvSocialVideoTagged(TuxTag tuxTag) {
        o.LJIIIZ(tuxTag, "<set-?>");
        this.LJLJJL = tuxTag;
    }

    public final void setTvTitle(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJLJ = tuxTextView;
    }

    public final void setTvToggle(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJLLL = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41531GRr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLFF = C221108m2.LIZIZ(C35892E6u.INSTANCE);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ez, this, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…_feed_video, this, false)");
        setItemView(LLLLIILL);
        View findViewById = getItemView().findViewById(R.id.my0);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.user_avatar)");
        setMAvatarView((C164046cC) findViewById);
        getMAvatarView().setBorderColor(R.color.ar);
        View findViewById2 = getItemView().findViewById(R.id.grh);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.music_cover)");
        setMMusicCoverView((OPX) findViewById2);
        View findViewById3 = getItemView().findViewById(R.id.hdk);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.origin_music_cover)");
        setIvOriginMusicCover((C71799SFv) findViewById3);
        View findViewById4 = getItemView().findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_name)");
        setTvName((TextView) findViewById4);
        View findViewById5 = getItemView().findViewById(R.id.k6n);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.social_video_tagged_tv)");
        setTvSocialVideoTagged((TuxTag) findViewById5);
        View findViewById6 = getItemView().findViewById(R.id.mbi);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_music)");
        setTvMusic((C8H9) findViewById6);
        View findViewById7 = getItemView().findViewById(R.id.i2n);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.preview_description_tv)");
        setTvDescription((C89K) findViewById7);
        View findViewById8 = getItemView().findViewById(R.id.i3t);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.preview_title)");
        setTvTitle((TuxTextView) findViewById8);
        View findViewById9 = getItemView().findViewById(R.id.mog);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.tv_toggle)");
        setTvToggle((TuxTextView) findViewById9);
        View findViewById10 = getItemView().findViewById(R.id.i1u);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.preview_anchor)");
        setAnchorLayout((LinearLayout) findViewById10);
        View findViewById11 = getItemView().findViewById(R.id.a2n);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.anchor_item_icon)");
        setAnchorIcon((SmartImageView) findViewById11);
        View findViewById12 = getItemView().findViewById(R.id.a2i);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.anchor_item_content)");
        setAnchorText((TextView) findViewById12);
        View findViewById13 = getItemView().findViewById(R.id.i26);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.id.preview_clean_title)");
        setPreviewTitle((TextView) findViewById13);
        View findViewById14 = getItemView().findViewById(R.id.ift);
        o.LJIIIIZZ(findViewById14, "itemView.findViewById(R.…sh_preview_permission_tv)");
        setPermissionTag((TuxTag) findViewById14);
        View findViewById15 = getItemView().findViewById(R.id.ifr);
        o.LJIIIIZZ(findViewById15, "itemView.findViewById(R.…view_bottom_left_content)");
        setLeftBottomContent((LinearLayout) findViewById15);
        this.LJZL = (TuxIconView) getItemView().findViewById(R.id.d32);
        this.LJZI = (TuxIconView) getItemView().findViewById(R.id.d3h);
        this.LL = (TuxIconView) getItemView().findViewById(R.id.d3q);
        this.LLD = (ViewGroup) getItemView().findViewById(R.id.ifu);
        this.LLF = (FrameLayout) getItemView().findViewById(R.id.grk);
        addView(getItemView());
        float LIZ = C6DY.LIZ();
        getMAvatarView().setAlpha(LIZ);
        TuxIconView tuxIconView = this.LJZL;
        if (tuxIconView != null) {
            tuxIconView.setAlpha(LIZ);
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            tuxIconView2.setAlpha(LIZ);
        }
        TuxIconView tuxIconView3 = this.LL;
        if (tuxIconView3 != null) {
            tuxIconView3.setAlpha(LIZ);
        }
        TuxIconView tuxIconView4 = this.LJZI;
        if (tuxIconView4 != null) {
            tuxIconView4.setAlpha(LIZ);
        }
        getAnchorLayout().setAlpha(LIZ);
        ViewGroup viewGroup = this.LLD;
        if (viewGroup != null) {
            viewGroup.setAlpha(LIZ);
        }
        getTvTitle().setAlpha(LIZ);
        getTvDescription().setAlpha(LIZ);
        getTvToggle().setAlpha(LIZ);
        getTvMusic().setAlpha(LIZ);
        FrameLayout frameLayout = this.LLF;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setAlpha(LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r16, java.lang.String r17, com.ss.android.ugc.aweme.base.model.UrlModel r18, int r19) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41531GRr.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int):void");
    }
}
