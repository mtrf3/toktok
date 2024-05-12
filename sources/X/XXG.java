package X;

import Y.ACListenerS21S0101000_2;
import Y.ACListenerS23S0101000_4;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS28S0201000_12;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS35S0100000_15;
import Y.ALAdapterS12S0100000_15;
import Y.ALAdapterS12S0200000_15;
import Y.ALAdapterS3S0110000_12;
import Y.AObjectS42S0101000_5;
import Y.AUListenerS99S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XXG extends RecyclerView.ViewHolder {
    public static int LLIL;
    public SmartImageView LJLIL;
    public ImageView LJLILLLLZI;
    public ImageView LJLJI;
    public ImageView LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TuxIconView LJLJL;
    public TuxIconView LJLJLJ;
    public ImageView LJLJLLL;
    public ViewGroup LJLL;
    public TuxIconView LJLLI;
    public ImageView LJLLILLLL;
    public ViewGroup LJLLJ;
    public ViewGroup LJLLL;
    public ViewGroup LJLLLL;
    public ViewGroup LJLLLLLL;
    public ViewGroup LJLZ;
    public View LJZ;
    public TextView LJZI;
    public RecyclerView LJZL;
    public TextView LL;
    public View LLD;
    public boolean LLF;
    public Context LLFF;
    public int LLFFF;
    public MusicModel LLFII;
    public int LLFZ;
    public int LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public C71897SJp LLIIIZ;
    public ViewGroup LLIIJI;
    public G87 LLIIJLIL;
    public XVG LLIIL;
    public InterfaceC51510KJm LLIILII;
    public XYR LLIILZL;
    public C72H<XYM> LLIIZ;

    public final void M() {
        if (this.LLFII.getCollectionType() != null) {
            this.LLF = MusicModel.CollectionType.COLLECTED.equals(this.LLFII.getCollectionType());
        }
        XVJ.LIZ(this.LJLJL, !this.LLF ? 1 : 0);
    }

    public final void P() {
        String str;
        MusicModel musicModel = this.LLFII;
        if (musicModel == null) {
            return;
        }
        if (!this.LLF && !XU0.LIZ(musicModel, this.LLFF, true)) {
            return;
        }
        C72H<XYM> c72h = this.LLIIZ;
        if (c72h != null) {
            MusicModel musicModel2 = this.LLFII;
            if (this.LLF) {
                str = "unfollow_type";
            } else {
                str = "follow_type";
            }
            c72h.onInternalEvent(new XYM(str, this.LLFZ, this.LLI, musicModel2));
        }
        this.LLF = !this.LLF;
        TuxIconView tuxIconView = this.LJLJL;
        XYR xyr = this.LLIILZL;
        if (tuxIconView != null) {
            tuxIconView.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.0f, 1.08f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.0f, 1.08f);
            ofFloat.setDuration(100L);
            ofFloat2.setDuration(100L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.08f, 0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.08f, 0.0f);
            ofFloat3.setDuration(100L);
            ofFloat4.setDuration(100L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 1.0f, 0.0f);
            ofFloat6.setDuration(100L);
            ofFloat5.setDuration(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 0.0f, 1.08f);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 0.0f, 1.08f);
            ofFloat7.setDuration(100L);
            ofFloat8.setDuration(100L);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.08f, 1.0f);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.08f, 1.0f);
            ofFloat9.setDuration(100L);
            ofFloat9.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
            animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
            animatorSet.addListener(new ALAdapterS12S0200000_15(xyr, animatorSet2, 4));
            animatorSet2.addListener(new ALAdapterS12S0100000_15(xyr, 22));
            animatorSet.start();
        }
    }

    public final boolean T() {
        MusicModel musicModel = this.LLFII;
        if (musicModel != null && musicModel.getMusic() != null && this.LLFII.getMusic().isCanNotReuse()) {
            return true;
        }
        return false;
    }

    public XXG(View view) {
        super(view);
        this.LLFF = this.itemView.getContext();
        this.LJLIL = (SmartImageView) this.itemView.findViewById(R.id.f12);
        if (C82852WfQ.LIZ().LJIIJ.invoke().booleanValue()) {
            SmartImageView smartImageView = this.LJLIL;
            S3I s3i = new S3I();
            s3i.LIZLLL = C17N.LJIILL(4.0d);
            smartImageView.setCircleOptions(new S3L(s3i));
        }
        this.LJLILLLLZI = (ImageView) this.itemView.findViewById(R.id.f86);
        this.LJLJI = (ImageView) this.itemView.findViewById(R.id.f7a);
        this.LJLJJI = (ImageView) this.itemView.findViewById(R.id.fae);
        this.LJLJJL = (TextView) this.itemView.findViewById(R.id.mby);
        this.LJLJJLL = (TextView) this.itemView.findViewById(R.id.mkc);
        this.LJLJL = (TuxIconView) this.itemView.findViewById(R.id.f75);
        this.LJLJLJ = (TuxIconView) this.itemView.findViewById(R.id.f6m);
        this.LJLJLLL = (ImageView) this.itemView.findViewById(R.id.f79);
        this.LJLL = (ViewGroup) this.itemView.findViewById(R.id.g6y);
        this.LJLLI = (TuxIconView) this.itemView.findViewById(R.id.fcb);
        this.LJLLILLLL = (ImageView) this.itemView.findViewById(R.id.f77);
        this.itemView.findViewById(R.id.mpw);
        this.LJLLJ = (ViewGroup) this.itemView.findViewById(R.id.j64);
        this.itemView.findViewById(R.id.mpx);
        this.LJLLL = (ViewGroup) this.itemView.findViewById(R.id.j63);
        this.LJLLLL = (ViewGroup) this.itemView.findViewById(R.id.g4i);
        this.LJLLLLLL = (ViewGroup) this.itemView.findViewById(R.id.j4l);
        this.LJLZ = (ViewGroup) this.itemView.findViewById(R.id.g6n);
        this.LJZ = this.itemView.findViewById(R.id.ngk);
        this.LJZI = (TextView) this.itemView.findViewById(R.id.mbl);
        this.LJZL = (RecyclerView) this.itemView.findViewById(R.id.gu6);
        this.LL = (TextView) this.itemView.findViewById(R.id.mbs);
        this.LLD = this.itemView.findViewById(R.id.j5k);
        this.LLIIIZ = (C71897SJp) this.itemView.findViewById(R.id.c9s);
        this.LLIIJI = (ViewGroup) this.itemView.findViewById(R.id.c9t);
        View findViewById = this.itemView.findViewById(R.id.f79);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0101000_15(0, this, 0), findViewById);
        }
        View findViewById2 = this.itemView.findViewById(R.id.f75);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0101000_4(0, this, 0), findViewById2);
        }
        View findViewById3 = this.itemView.findViewById(R.id.g6y);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0101000_15(0, this, 1), findViewById3);
        }
        View findViewById4 = this.itemView.findViewById(R.id.g4i);
        if (findViewById4 != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(1, this, 8), findViewById4);
        }
        View findViewById5 = this.itemView.findViewById(R.id.j64);
        if (findViewById5 != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(2, this, 14), findViewById5);
        }
        View findViewById6 = this.itemView.findViewById(R.id.f77);
        if (findViewById6 != null) {
            if (C46126I8k.LIZ() != 0 && (findViewById6 instanceof TuxIconView)) {
                ((TuxIconView) findViewById6).setIconRes(R.raw.icon_scissors_right);
            }
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(2, this, 11), findViewById6);
        }
        View findViewById7 = this.itemView.findViewById(R.id.f6m);
        if (findViewById7 != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(3, this, 15), findViewById7);
        }
        C84987XXb c84987XXb = (C84987XXb) this;
        c84987XXb.LJLLI.setVisibility(0);
        if (LLIL <= 0) {
            this.LJLL.measure(View.MeasureSpec.makeMeasureSpec(536870911, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(536870911, LiveLayoutPreloadThreadPriority.DEFAULT));
            LLIL = (int) (KL2.LIZJ(this.LLFF, 8.0f) + this.LJLL.getMeasuredWidth());
        }
        this.LLIILZL = new XYR(c84987XXb);
        if (C00F.LIZ(31744, 0, "smaller_apply_button_in_music_library", true) == 1) {
            this.LJLLI.setIconRes(R.raw.icon_tick_fill_small);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0134. Please report as an issue. */
    public final void L(XXW xxw) {
        boolean z;
        String str;
        String singer;
        String str2;
        int i;
        MusicModel musicModel = xxw.LIZ;
        if (musicModel == null) {
            return;
        }
        this.LLII = xxw.LJI;
        this.LLIFFJFJJ = xxw.LIZJ;
        this.LLIIII = xxw.LIZLLL;
        this.LLI = xxw.LJIIIZ;
        this.LLFZ = xxw.LJIIIIZZ;
        this.LLIIL = xxw.LJIIJ;
        this.LLIIIILZ = xxw.LJIILIIL;
        this.LLIIIJ = xxw.LJIILJJIL;
        int i2 = xxw.LJII;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIIL = z;
        this.LLFII = musicModel;
        this.LLFFF = i2;
        M();
        if (!TextUtils.isEmpty(this.LLFII.getName())) {
            this.LJLJJL.setText(this.LLFII.getName());
        } else {
            this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this.LLFF));
            TextView textView = this.LJLJJL;
            if (!TextUtils.isEmpty(this.LLFII.getName())) {
                str = this.LLFII.getName();
            } else {
                str = "";
            }
            textView.setText(str);
        }
        this.LJLILLLLZI.setVisibility(8);
        C72115SRz.LIZ(this.LJLJJL, this.LLFII.getMusic());
        if (this.LLFII.getMusicType() == MusicModel.MusicType.VIDEO_EXTRACT) {
            this.LJLJJLL.setVisibility(8);
        } else {
            this.LJLJJLL.setVisibility(0);
            if (this.LLFII.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(this.LLFII.getMatchedPGCSoundInfo().getMixedAuthor())) {
                this.LJLJJLL.setText(this.LLFII.getMatchedPGCSoundInfo().getMixedAuthor());
            } else if (!this.LLFII.isPgc() && this.LLFII.getMatchedSongInfo() != null && !TextUtils.isEmpty(this.LLFII.getMatchedSongInfo().getTitle())) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("\"");
                    LIZ.append(this.LLFII.getMatchedSongInfo().getTitle());
                    LIZ.append("\"");
                    this.LJLJJLL.setText(this.itemView.getContext().getString(R.string.jc, X1D.LIZIZ(LIZ)));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    this.LJLJJLL.setVisibility(8);
                }
            } else {
                TextView textView2 = this.LJLJJLL;
                if (TextUtils.isEmpty(this.LLFII.getSinger())) {
                    singer = this.LLFF.getString(R.string.tel);
                } else {
                    singer = this.LLFII.getSinger();
                }
                textView2.setText(singer);
            }
        }
        C72395Sb9.LIZIZ(this.LJLIL, this.LLFII);
        C84987XXb c84987XXb = (C84987XXb) this;
        c84987XXb.LLILII = C78929UyL.LJIIIZ(c84987XXb.LLFII.getPresenterDuration());
        if (c84987XXb.LLIIIILZ && ((!c84987XXb.LLIIIJ || !c84987XXb.Y()) && c84987XXb.LLFII.getUserCount() > 0)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c84987XXb.LLILII);
            LIZ2.append(" · ");
            LIZ2.append(c84987XXb.LLFF.getResources().getQuantityString(R.plurals.gy, c84987XXb.LLFII.getUserCount(), C77123UOp.LJJIIJ(c84987XXb.LLFII.getUserCount())));
            c84987XXb.LLILII = X1D.LIZIZ(LIZ2);
        }
        c84987XXb.LJZI.setText(c84987XXb.LLILII);
        N(xxw.LJ);
        if (T()) {
            this.LJLL.setBackground(C04270Et.LIZIZ(this.LLFF, R.drawable.a6p));
            C07S.LIZ(this.LJLLI, ColorStateList.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.gp, this.LLFF)));
        }
        if (xxw.LJ && xxw.LJIILL == 0) {
            X(false);
        } else {
            Q(false);
        }
        if (xxw.LIZ.isLocalMusic()) {
            this.LJLJL.setVisibility(8);
            this.LJLJLLL.setVisibility(8);
        } else {
            this.LJLJL.setVisibility(0);
            this.LJLJLLL.setVisibility(8);
        }
        if (this.LLIFFJFJJ && this.LLI < 12) {
            this.LJLJI.setVisibility(0);
            switch (this.LLI) {
                case 0:
                    i = R.drawable.bks;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ = (int) KL2.LIZJ(this.LJLJI.getContext(), 0.0f);
                    marginLayoutParams.topMargin = LIZJ;
                    marginLayoutParams.leftMargin = LIZJ;
                    this.LJLJI.setImageResource(i);
                    break;
                case 1:
                    i = R.drawable.bkw;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ2 = (int) KL2.LIZJ(this.LJLJI.getContext(), 0.0f);
                    marginLayoutParams2.topMargin = LIZJ2;
                    marginLayoutParams2.leftMargin = LIZJ2;
                    this.LJLJI.setImageResource(i);
                    break;
                case 2:
                    i = R.drawable.bkx;
                    ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ22 = (int) KL2.LIZJ(this.LJLJI.getContext(), 0.0f);
                    marginLayoutParams22.topMargin = LIZJ22;
                    marginLayoutParams22.leftMargin = LIZJ22;
                    this.LJLJI.setImageResource(i);
                    break;
                case 3:
                    i = R.drawable.bky;
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ3 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams3.topMargin = LIZJ3;
                    marginLayoutParams3.leftMargin = LIZJ3;
                    this.LJLJI.setImageResource(i);
                    break;
                case 4:
                    i = R.drawable.bkz;
                    ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ32 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams32.topMargin = LIZJ32;
                    marginLayoutParams32.leftMargin = LIZJ32;
                    this.LJLJI.setImageResource(i);
                    break;
                case 5:
                    i = R.drawable.bl0;
                    ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ322 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams322.topMargin = LIZJ322;
                    marginLayoutParams322.leftMargin = LIZJ322;
                    this.LJLJI.setImageResource(i);
                    break;
                case 6:
                    i = R.drawable.bl1;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ3222 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams3222.topMargin = LIZJ3222;
                    marginLayoutParams3222.leftMargin = LIZJ3222;
                    this.LJLJI.setImageResource(i);
                    break;
                case 7:
                    i = R.drawable.bl2;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ32222 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams32222.topMargin = LIZJ32222;
                    marginLayoutParams32222.leftMargin = LIZJ32222;
                    this.LJLJI.setImageResource(i);
                    break;
                case 8:
                    i = R.drawable.bl3;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ322222 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams322222.topMargin = LIZJ322222;
                    marginLayoutParams322222.leftMargin = LIZJ322222;
                    this.LJLJI.setImageResource(i);
                    break;
                case 9:
                    i = R.drawable.bkt;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ3222222 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams3222222.topMargin = LIZJ3222222;
                    marginLayoutParams3222222.leftMargin = LIZJ3222222;
                    this.LJLJI.setImageResource(i);
                    break;
                case 10:
                    i = R.drawable.bku;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ32222222 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams32222222.topMargin = LIZJ32222222;
                    marginLayoutParams32222222.leftMargin = LIZJ32222222;
                    this.LJLJI.setImageResource(i);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i = R.drawable.bkv;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
                    int LIZJ322222222 = (int) KL2.LIZJ(this.LJLJI.getContext(), 2.0f);
                    marginLayoutParams322222222.topMargin = LIZJ322222222;
                    marginLayoutParams322222222.leftMargin = LIZJ322222222;
                    this.LJLJI.setImageResource(i);
                    break;
            }
        } else {
            this.LJLJI.setVisibility(8);
        }
        XVG xvg = c84987XXb.LLIIL;
        if (xvg != null) {
            str2 = xvg.LIZ;
        } else {
            str2 = null;
        }
        if (TextUtils.equals("search_music", str2)) {
            MusicModel musicModel2 = c84987XXb.LLFII;
            if (musicModel2 != null && musicModel2.getMusic() != null && c84987XXb.LLFII.getMusic().getMusicTags() != null && c84987XXb.LLFII.getMusic().getMusicTags().size() > 0) {
                InterfaceC212198Ul LLILZ = SearchServiceImpl.LLLZI().LLILZ();
                RecyclerView mMusicTagsContainer = c84987XXb.LJZL;
                o.LJIIIIZZ(mMusicTagsContainer, "mMusicTagsContainer");
                List<MusicTag> musicTags = c84987XXb.LLFII.getMusic().getMusicTags();
                o.LJIIIIZZ(musicTags, "mItem.music.musicTags");
                LLILZ.LJI(mMusicTagsContainer, musicTags, new ACListenerS35S0100000_15(c84987XXb, 3));
            } else {
                RecyclerView recyclerView = c84987XXb.LJZL;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    c84987XXb.LJZL.removeAllViews();
                }
            }
        } else if (c84987XXb.LLIIIJ) {
            if (c84987XXb.Y()) {
                TextView textView3 = c84987XXb.LL;
                List<MusicTag> musicTags2 = c84987XXb.LLFII.getMusic().getMusicTags();
                o.LJIIIIZZ(musicTags2, "mItem.music.musicTags");
                textView3.setText(((MusicTag) ORZ.LJLLJ(musicTags2)).getTagTitle());
                c84987XXb.LL.setVisibility(0);
            } else {
                c84987XXb.LL.setVisibility(8);
            }
        } else {
            c84987XXb.LL.setVisibility(8);
        }
        MusicModel musicModel3 = xxw.LIZ;
        if (musicModel3.getSoundsListType() == 2) {
            if (this.LLIILII == null) {
                this.LLIILII = Z9N.LIZIZ.LLILZ().LJIIIIZZ(new C51509KJl(this.LJLLLLLL, new AObjectS42S0101000_5(1, this, 18)));
            }
            C51511KJn c51511KJn = new C51511KJn();
            c51511KJn.LIZ = ((Integer) musicModel3.getExtraParamFromPretreatment().get("rank", (String) (-1))).intValue();
            this.LLIILII.LIZ(c51511KJn);
        } else {
            InterfaceC51510KJm interfaceC51510KJm = this.LLIILII;
            if (interfaceC51510KJm != null) {
                interfaceC51510KJm.LIZ(new C51511KJn());
            }
        }
        int i3 = xxw.LJIILL;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.LJLJLJ.setVisibility(0);
                    this.LJLJLJ.setAlpha(1.0f);
                }
            } else {
                this.LJLJLJ.setVisibility(0);
                this.LJLJLJ.setAlpha(0.5f);
            }
        } else {
            this.LJLJLJ.setVisibility(8);
        }
        if (xxw.LJII == 1) {
            this.LLIIJI.setVisibility(0);
            this.LLIIIZ.setChecked(xxw.LJIILLIIL);
            C16880lQ.LJIIL(this.LLIIJI, new ACListenerS28S0201000_12(0, this, xxw, 0));
        } else {
            this.LLIIJI.setVisibility(8);
        }
        if (xxw.LJIIZILJ) {
            this.LJLLLL.setClickable(false);
            this.LJLLLLLL.setAlpha(0.34f);
            this.LLD.setAlpha(0.34f);
            if (xxw.LJII != 1) {
                return;
            }
            this.LLIIJI.setClickable(false);
            return;
        }
        this.LJLLLL.setClickable(true);
        this.LJLLLLLL.setAlpha(1.0f);
        this.LLD.setAlpha(1.0f);
        if (xxw.LJII != 1) {
            return;
        }
        this.LLIIJI.setClickable(true);
    }

    public final void N(boolean z) {
        this.LJLJJI.clearAnimation();
        if (z) {
            MusicModel musicModel = this.LLFII;
            if (musicModel != null) {
                if (musicModel.isLocalMusic()) {
                    this.LJLJJI.setImageResource(R.drawable.b2b);
                    return;
                } else {
                    if (this.LLFII.getMusicType() != MusicModel.MusicType.ONLINE && this.LLFII.getMusicType() != MusicModel.MusicType.REUSE_AUDIO) {
                        return;
                    }
                    this.LJLJJI.setVisibility(0);
                    this.LJLJJI.setImageResource(R.drawable.b2b);
                    return;
                }
            }
            return;
        }
        this.LJLJJI.setVisibility(0);
        this.LJLJJI.setImageResource(R.drawable.b1n);
    }

    public final void Q(boolean z) {
        this.LJLLILLLL.setVisibility(8);
        if (this.LLIIII) {
            this.LJLLJ.setVisibility(8);
            return;
        }
        if (this.LJLL.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.LJLLLL.setClickable(false);
            int i = -LLIL;
            int LIZJ = (int) KL2.LIZJ(this.LLFF, 30.0f);
            if (C90193gN.LIZIZ(this.LLFF)) {
                LIZJ = -LIZJ;
            }
            U(0L, 1, 0, 0, i, true, 0, LIZJ);
            return;
        }
        this.LJLL.setVisibility(8);
    }

    public final void X(boolean z) {
        if (this.LLIIIL) {
            return;
        }
        if (this.LLII) {
            this.LJLLILLLL.setVisibility(0);
        }
        if (this.LLIIII) {
            this.LJLLJ.setVisibility(0);
            return;
        }
        if (this.LJLL.getVisibility() == 0) {
            return;
        }
        if (z) {
            this.LJLLLL.setClickable(false);
            int i = -LLIL;
            int LIZJ = (int) KL2.LIZJ(this.LLFF, 30.0f);
            if (C90193gN.LIZIZ(this.LLFF)) {
                LIZJ = -LIZJ;
            }
            this.LJLL.setVisibility(0);
            if (C90193gN.LIZIZ(this.LLFF)) {
                ((ViewGroup.MarginLayoutParams) this.LJLLL.getLayoutParams()).leftMargin = -LLIL;
            } else {
                ((ViewGroup.MarginLayoutParams) this.LJLLL.getLayoutParams()).rightMargin = -LLIL;
            }
            U(100L, 0, 1, i, 0, false, LIZJ, 0);
            return;
        }
        this.LJLL.setVisibility(0);
    }

    public final void onClick(View view) {
        G87 g87 = this.LLIIJLIL;
        if (g87 != null && (this instanceof C84987XXb)) {
            g87.LIZ((C84987XXb) this, view, this.LLFII, this.LLFFF);
        }
    }

    public final void V(boolean z, boolean z2, boolean z3) {
        if (z) {
            if (e1.LIZ(31744, "enable_use_music_before_play", true, false) && !T() && !this.LLFII.isLocalMusic()) {
                X(true);
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.fc);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.LJLJJI.setImageResource(R.drawable.b8l);
            this.LJLJJI.startAnimation(loadAnimation);
            return;
        }
        this.LJLJJI.clearAnimation();
        N(z2);
        if (z3) {
            X(true);
        } else {
            Q(true);
        }
    }

    public final void U(long j, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        ValueAnimator duration = ValueAnimator.ofInt(i3, i4).setDuration(200);
        duration.addUpdateListener(new AUListenerS99S0100000_12(this, 0));
        duration.addListener(new ALAdapterS3S0110000_12(this, z, 0));
        AlphaAnimation alphaAnimation = new AlphaAnimation(i, i2);
        TranslateAnimation translateAnimation = new TranslateAnimation(i5, i6, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j);
        this.LJLL.startAnimation(animationSet);
        duration.start();
    }
}
