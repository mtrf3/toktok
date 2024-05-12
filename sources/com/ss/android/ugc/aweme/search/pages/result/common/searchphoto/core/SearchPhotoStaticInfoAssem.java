package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.AJ9;
import X.AV1;
import X.C1JI;
import X.C1JX;
import X.C214348b8;
import X.C220858ld;
import X.C32151Nz;
import X.C34127DaN;
import X.C38995FSd;
import X.C49098JOs;
import X.C49379JZn;
import X.C49421JaT;
import X.C49448Jau;
import X.C54840Lfg;
import X.C57105Mb7;
import X.C5H3;
import X.C65352Pkq;
import X.C71898SJq;
import X.C72434Sbm;
import X.C72972SkS;
import X.C78847Ux1;
import X.C79043V0l;
import X.C8XO;
import X.C97N;
import X.J7H;
import X.JJC;
import X.JKM;
import X.JKU;
import X.JKV;
import X.O6R;
import X.V1B;
import X.W5F;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchPhotoStaticInfoAssem extends ReusedUIContentAssem<SearchPhotoStaticInfoAssem> implements C8XO<JKM> {
    public final C5H3 LJZL;
    public Aweme LL;
    public C49448Jau LLD;
    public View LLF;
    public TuxTextView LLFF;
    public FixedRatioFrameLayout LLFFF;
    public View LLFII;
    public C71898SJq LLFZ;
    public View LLI;
    public C72434Sbm LLIFFJFJJ;
    public TuxTextView LLII;
    public TextView LLIIII;
    public ImageView LLIIIILZ;
    public ConstraintLayout LLIIIJ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchPhotoStaticInfoAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchPhotoViewModel.class), JKU.INSTANCE);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(JKM jkm) {
        Aweme aweme;
        TuxTextView tuxTextView;
        int i;
        boolean z;
        View view;
        int i2;
        boolean z2;
        SpannableString spannableString;
        TuxTextView tuxTextView2;
        int i3;
        List<TextExtraStruct> textExtra;
        User author;
        String nickname;
        TuxTextView tuxTextView3;
        CharSequence text;
        TuxTextView tuxTextView4;
        JKM item = jkm;
        o.LJIIIZ(item, "item");
        this.LL = item.LJLIL;
        Context context = getContext();
        if (context != null && (aweme = this.LL) != null && (tuxTextView = this.LLFF) != null) {
            tuxTextView.setText(C57105Mb7.LJI(aweme.getCreateTime() * 1000, context));
            if (aweme.isAd()) {
                i = 8;
            } else {
                i = 0;
            }
            tuxTextView.setVisibility(i);
        }
        C71898SJq c71898SJq = this.LLFZ;
        if (c71898SJq != null) {
            c71898SJq.setVisibility(8);
        }
        TuxTextView tuxTextView5 = this.LLFF;
        boolean z3 = true;
        if (tuxTextView5 != null && tuxTextView5.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (tuxTextView3 = this.LLFF) != null && (text = tuxTextView3.getText()) != null && text.length() != 0 && (tuxTextView4 = this.LLFF) != null) {
            tuxTextView4.post(new ARunnableS44S0100000_8(this, 110));
        }
        Aweme aweme2 = this.LL;
        if (aweme2 != null && (view = this.LLI) != null) {
            if (C220858ld.LJIIIZ(aweme2)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        Aweme aweme3 = this.LL;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            TuxTextView tuxTextView6 = this.LLII;
            if (tuxTextView6 != null) {
                if (AV1.LJIJJLI(author)) {
                    nickname = author.getUniqueId();
                } else {
                    nickname = author.getNickname();
                }
                tuxTextView6.setText(nickname);
                if (AJ9.LIZIZ(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1))) {
                    ImageView imageView = this.LLIIIILZ;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                } else {
                    ImageView imageView2 = this.LLIIIILZ;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                }
                if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZIZ.getValue()).videoImageAsyncLoad) {
                    C38995FSd.LIZJ().execute(new ARunnableS27S0200000_8(this, author, 67));
                } else {
                    W5F LJI = C1JX.LJI(author);
                    LJI.LJIILIIL(J7H.LIZ(100));
                    LJI.LIZIZ("AbsCellViewHolder");
                    LJI.LJJIIJ = this.LLIFFJFJJ;
                    LJI.LJ();
                }
            } else {
                o.LJIJI("txtAuthorName");
                throw null;
            }
        }
        if (((SearchPhotoViewModel) this.LJZL.getValue()).LJLJJI) {
            ConstraintLayout constraintLayout = this.LLIIIJ;
            if (constraintLayout != null) {
                C79043V0l.LJIL(O6R.LJJIIZ(TypedValue.applyDimension(1, 16, Resources.getSystem().getDisplayMetrics())), constraintLayout);
            }
        } else {
            ConstraintLayout constraintLayout2 = this.LLIIIJ;
            if (constraintLayout2 != null) {
                C79043V0l.LJIL(O6R.LJJIIZ(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics())), constraintLayout2);
            }
        }
        Aweme aweme4 = this.LL;
        if (aweme4 == null) {
            return;
        }
        if (TextUtils.isEmpty(aweme4.getDesc())) {
            TextView textView = this.LLIIII;
            if (textView != null) {
                textView.setText("");
                TextView textView2 = this.LLIIII;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("txtDesc");
                    throw null;
                }
            }
            o.LJIJI("txtDesc");
            throw null;
        }
        TextView textView3 = this.LLIIII;
        if (textView3 != null) {
            textView3.setVisibility(0);
            List<TextExtraStruct> textExtra2 = aweme4.getTextExtra();
            String desc = aweme4.getDesc();
            if (aweme4.getTextExtra() != null && ((textExtra = aweme4.getTextExtra()) == null || !textExtra.isEmpty())) {
                Iterator<TextExtraStruct> it = aweme4.getTextExtra().iterator();
                while (it.hasNext()) {
                    if (it.next().isCommerce()) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
                if (z2) {
                    ICommerceChallengeService LIZIZ = CommerceChallengeServiceImpl.LIZIZ();
                    Aweme aweme5 = this.LL;
                    LIZIZ.LJIJJLI(aweme5);
                    this.LL = aweme5;
                }
            } else {
                ICommerceChallengeService LIZIZ2 = CommerceChallengeServiceImpl.LIZIZ();
                Aweme aweme6 = this.LL;
                LIZIZ2.LJIJJLI(aweme6);
                this.LL = aweme6;
            }
            if (JKV.LIZ == 1 && !TextUtils.equals(((SearchPhotoViewModel) this.LJZL.getValue()).LJLJJL, "selfharm")) {
                TextView textView4 = this.LLIIII;
                if (textView4 != null) {
                    if ((textView4 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) textView4) != null) {
                        Integer LIZJ = C72972SkS.LIZJ(tuxTextView2, "context", R.attr.go);
                        if (LIZJ != null) {
                            i3 = LIZJ.intValue();
                        } else {
                            i3 = 0;
                        }
                        tuxTextView2.setTextColor(i3);
                        tuxTextView2.setTuxFont(41);
                    }
                } else {
                    o.LJIJI("txtDesc");
                    throw null;
                }
            } else {
                z3 = false;
            }
            if (aweme4.getSearchDesc() != null) {
                if (z3 && aweme4.getHighlightInfoList() != null) {
                    C49448Jau c49448Jau = this.LLD;
                    if (c49448Jau != null) {
                        String searchDesc = aweme4.getSearchDesc();
                        o.LJIIIIZZ(searchDesc, "validAweme.searchDesc");
                        spannableString = new SpannableString(searchDesc);
                        c49448Jau.LIZ(spannableString, "search_desc", 0);
                    } else {
                        o.LJIJI("highlightHelper");
                        throw null;
                    }
                } else {
                    spannableString = new SpannableString(aweme4.getSearchDesc());
                }
            } else {
                spannableString = new SpannableString(aweme4.getDesc());
            }
            TextView textView5 = this.LLIIII;
            if (textView5 != null) {
                textView5.setText(spannableString);
                if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
                    if (z2) {
                        ICommerceChallengeService LIZIZ3 = CommerceChallengeServiceImpl.LIZIZ();
                        TextView textView6 = this.LLIIII;
                        if (textView6 != null) {
                            LIZIZ3.LJIIJJI(textView6, this.LL, spannableString);
                        } else {
                            o.LJIJI("txtDesc");
                            throw null;
                        }
                    }
                } else {
                    ICommerceChallengeService LIZIZ4 = CommerceChallengeServiceImpl.LIZIZ();
                    TextView textView7 = this.LLIIII;
                    if (textView7 != null) {
                        LIZIZ4.LJIIJJI(textView7, this.LL, spannableString);
                    } else {
                        o.LJIJI("txtDesc");
                        throw null;
                    }
                }
                aweme4.setTextExtra(textExtra2);
                aweme4.setDesc(desc);
                TextView textView8 = this.LLIIII;
                if (textView8 != null) {
                    textView8.setMaxLines(2);
                    return;
                } else {
                    o.LJIJI("txtDesc");
                    throw null;
                }
            }
            o.LJIJI("txtDesc");
            throw null;
        }
        o.LJIJI("txtDesc");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JKM jkm) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        TuxTextView tuxTextView;
        C72434Sbm c72434Sbm;
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxTextView) view.findViewById(R.id.n5x);
        this.LLFFF = (FixedRatioFrameLayout) view.findViewById(R.id.j7h);
        this.LLFII = view.findViewById(R.id.n5z);
        this.LLFZ = (C71898SJq) view.findViewById(R.id.n5y);
        this.LLI = view.findViewById(R.id.n6s);
        this.LLIFFJFJJ = (C72434Sbm) view.findViewById(R.id.a_v);
        if (C34127DaN.LJFF() && (c72434Sbm = this.LLIFFJFJJ) != null) {
            C49421JaT.LJ(c72434Sbm, true);
        }
        View findViewById = view.findViewById(R.id.aa0);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.author_name)");
        TuxTextView tuxTextView2 = (TuxTextView) findViewById;
        this.LLII = tuxTextView2;
        tuxTextView2.setTextDirection(5);
        this.LLIIIILZ = (ImageView) view.findViewById(R.id.n5v);
        this.LLIIIJ = (ConstraintLayout) view.findViewById(R.id.a_z);
        View findViewById2 = view.findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.desc)");
        this.LLIIII = (TextView) findViewById2;
        this.LLF = view.findViewById(R.id.c7d);
        this.LLD = new C49448Jau(new C49379JZn(this));
        JJC.LIZ.getClass();
        if (JJC.LIZ() && (tuxTextView = this.LLFF) != null) {
            tuxTextView.setTuxFont(82);
        }
        C97N.LIZ.getClass();
        if (C97N.LIZ()) {
            C72434Sbm c72434Sbm2 = this.LLIFFJFJJ;
            if (c72434Sbm2 != null && (layoutParams = c72434Sbm2.getLayoutParams()) != null) {
                layoutParams.width = (int) C78847Ux1.LJJIFFI(20);
                layoutParams.height = (int) C78847Ux1.LJJIFFI(20);
            }
            TuxTextView tuxTextView3 = this.LLII;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(61);
            } else {
                o.LJIJI("txtAuthorName");
                throw null;
            }
        }
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LIZLLL());
        if (valueOf.intValue() > 0) {
            float LJIIZILJ = C32151Nz.LJIIZILJ(valueOf);
            FixedRatioFrameLayout fixedRatioFrameLayout = this.LLFFF;
            if (fixedRatioFrameLayout != null) {
                C1JI.LJJIIZ(fixedRatioFrameLayout, Float.valueOf(LJIIZILJ), null, null, null, null, 30);
            }
            View view2 = this.LLI;
            if (view2 != null) {
                C1JI.LJJIIZ(view2, Float.valueOf(LJIIZILJ), null, null, null, null, 30);
            }
            View view3 = this.LLFII;
            if (view3 != null) {
                C1JI.LJJIIZ(view3, null, null, null, Float.valueOf(LJIIZILJ), Float.valueOf(LJIIZILJ), 7);
            }
        }
        Integer num = 0;
        if (num.intValue() > 0) {
            int intValue = num.intValue();
            View view4 = this.LLF;
            if (view4 != null) {
                C79043V0l.LJJ((int) C78847Ux1.LJJIFFI(intValue), view4);
            }
            View view5 = this.LLF;
            if (view5 != null) {
                C54840Lfg.LJLIIL((int) C78847Ux1.LJJIFFI(intValue), view5);
            }
            TextView textView = this.LLIIII;
            if (textView != null) {
                C79043V0l.LJIL((int) C78847Ux1.LJJIFFI(intValue), textView);
                TextView textView2 = this.LLIIII;
                if (textView2 != null) {
                    V1B.LJLJLJ(0, textView2);
                    return;
                } else {
                    o.LJIJI("txtDesc");
                    throw null;
                }
            }
            o.LJIJI("txtDesc");
            throw null;
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JKM jkm) {
    }
}
