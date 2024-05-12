package X;

import Y.ACListenerS25S0201000_8;
import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JK5 extends JLX {
    public final Context LJLJJI;
    public final JJK LJLJJL;
    public final JJK LJLJJLL;
    public final JIB LJLJL;
    public final C49153JQv LJLJLJ;
    public final JGK LJLJLLL;
    public JQA LJLL;
    public JPL LJLLI;
    public final JLZ<Aweme> LJLLILLLL;
    public List<? extends Aweme> LJLLJ;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (this.LJLLJ.size() == 1) {
            return 1;
        }
        return this.LJLLJ.size();
    }

    @Override // X.JLX
    public final List<Aweme> LJLLLLLL() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        float LIZJ;
        String labelName;
        boolean z5;
        TuxTextView tuxTextView;
        int LJJJ;
        SpannableString spannableString;
        String searchDesc;
        Aweme aweme;
        C48881JGj v;
        Aweme aweme2;
        int i3;
        int i4;
        Aweme aweme3;
        JGI core;
        AwemeSearchAdModel searchAdInfo;
        Boolean isHorizontal;
        AwemeSearchAdModel searchAdInfo2;
        Integer preciseAdCTAPosition;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (!(viewHolder instanceof ViewOnAttachStateChangeListenerC48975JJz)) {
            return;
        }
        Aweme aweme4 = (Aweme) ListProtector.get(this.LJLLJ, i);
        ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz = (ViewOnAttachStateChangeListenerC48975JJz) viewHolder;
        AwemeRawAd awemeRawAd = aweme4.getAwemeRawAd();
        JQA jqa = this.LJLL;
        if (this.LJLLJ.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i == getItemCount() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        ACListenerS25S0201000_8 aCListenerS25S0201000_8 = new ACListenerS25S0201000_8(i, this, aweme4, 2);
        JPL jpl = this.LJLLI;
        viewOnAttachStateChangeListenerC48975JJz.LJLL = aweme4;
        viewOnAttachStateChangeListenerC48975JJz.LLFFF = jqa;
        viewOnAttachStateChangeListenerC48975JJz.LLIIIJ = jpl;
        if (awemeRawAd != null && (searchAdInfo2 = awemeRawAd.getSearchAdInfo()) != null && (preciseAdCTAPosition = searchAdInfo2.getPreciseAdCTAPosition()) != null) {
            i2 = preciseAdCTAPosition.intValue();
        } else {
            i2 = 1;
        }
        viewOnAttachStateChangeListenerC48975JJz.LJLLILLLL = i2;
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (isHorizontal = searchAdInfo.isHorizontal()) != null) {
            z3 = isHorizontal.booleanValue();
        } else {
            z3 = false;
        }
        viewOnAttachStateChangeListenerC48975JJz.LJLLJ = z3;
        viewOnAttachStateChangeListenerC48975JJz.itemView.getContext();
        viewOnAttachStateChangeListenerC48975JJz.LLFII = aCListenerS25S0201000_8;
        if (awemeRawAd != null) {
            Aweme aweme5 = viewOnAttachStateChangeListenerC48975JJz.LJLL;
            if (aweme5 != null && aweme5.isAd()) {
                if (C46278IEg.LIZ()) {
                    JPL jpl2 = viewOnAttachStateChangeListenerC48975JJz.LLIIIJ;
                    if (jpl2 != null) {
                        jpl2.u50(new JK1(viewOnAttachStateChangeListenerC48975JJz));
                    }
                    JPL jpl3 = viewOnAttachStateChangeListenerC48975JJz.LLIIIJ;
                    if (jpl3 != null) {
                        jpl3.LLLLZI();
                    }
                } else {
                    IAdSceneService LJII = AdSceneServiceImpl.LJII();
                    if (LJII != null) {
                        viewOnAttachStateChangeListenerC48975JJz.LJLLI = LJII.LIZ();
                        JK6 jk6 = new JK6();
                        jk6.LIZ = new JK0(viewOnAttachStateChangeListenerC48975JJz);
                        jk6.LIZIZ = viewOnAttachStateChangeListenerC48975JJz.LJLL;
                        jk6.LIZJ = awemeRawAd;
                        jk6.LIZLLL = viewOnAttachStateChangeListenerC48975JJz.LJLJLJ;
                        JK3 jk3 = viewOnAttachStateChangeListenerC48975JJz.LJLLI;
                        if (jk3 != null) {
                            jk3.init(jk6);
                        }
                    }
                }
            } else {
                RelativeLayout relativeLayout = viewOnAttachStateChangeListenerC48975JJz.LLF;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                RelativeLayout relativeLayout2 = viewOnAttachStateChangeListenerC48975JJz.LL;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
                FrameLayout frameLayout = viewOnAttachStateChangeListenerC48975JJz.LLFF;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                TuxTextView tuxTextView2 = viewOnAttachStateChangeListenerC48975JJz.LJZ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                }
            }
        }
        viewOnAttachStateChangeListenerC48975JJz.LJLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(viewOnAttachStateChangeListenerC48975JJz, 66)));
        C48881JGj v2 = viewOnAttachStateChangeListenerC48975JJz.v();
        if (v2 != null) {
            v2.LJIJJLI = jqa;
        }
        C48881JGj v3 = viewOnAttachStateChangeListenerC48975JJz.v();
        if (v3 != null) {
            v3.LJIILJJIL = (JGK) viewOnAttachStateChangeListenerC48975JJz.LLIIIILZ.getValue();
        }
        C48912JHo LLLIIII = viewOnAttachStateChangeListenerC48975JJz.LLLIIII();
        if (LLLIIII != null) {
            LLLIIII.LJFF = viewOnAttachStateChangeListenerC48975JJz.getAdapterPosition();
        }
        viewOnAttachStateChangeListenerC48975JJz.LJLLL.LIZ(aweme4);
        viewOnAttachStateChangeListenerC48975JJz.LJLLL.setVideoPlayerStatusListener(viewOnAttachStateChangeListenerC48975JJz.LLI);
        JGI core2 = viewOnAttachStateChangeListenerC48975JJz.LJLLL.getCore();
        if (core2 != null) {
            core2.setMSearchAdViewCallBack((JK2) viewOnAttachStateChangeListenerC48975JJz.LLIIII.getValue());
        }
        Video video = null;
        if (C46278IEg.LIZ() && (core = viewOnAttachStateChangeListenerC48975JJz.LJLLL.getCore()) != null) {
            JGI.LJIILJJIL(core, null, jpl, 1);
        }
        float f = 8.0f;
        if (z && (v = viewOnAttachStateChangeListenerC48975JJz.v()) != null && (aweme2 = v.LIZJ) != null && aweme2.getVideo() != null) {
            C48881JGj v4 = viewOnAttachStateChangeListenerC48975JJz.v();
            if (v4 != null && (aweme3 = v4.LIZJ) != null) {
                video = aweme3.getVideo();
            }
            o.LJI(video);
            int width = video.getWidth();
            int height = video.getHeight();
            Context context = viewOnAttachStateChangeListenerC48975JJz.itemView.getContext();
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC48975JJz.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int[] iArr = new int[2];
            int i5 = viewOnAttachStateChangeListenerC48975JJz.LLIFFJFJJ;
            int i6 = viewOnAttachStateChangeListenerC48975JJz.LLII;
            if (C32044Chs.LJ()) {
                i6 = C32044Chs.LJII();
                i5 = C32044Chs.LJIIIIZZ();
            }
            float LIZJ2 = KL2.LIZJ(context, 8.0f);
            float f2 = height / width;
            if (viewOnAttachStateChangeListenerC48975JJz.LJLLJ && width > height) {
                int i7 = (int) (i5 - (LIZJ2 * 2));
                iArr[0] = i7;
                iArr[1] = (int) (i7 * f2);
                i3 = 1;
            } else if (width == height) {
                int i8 = (int) (i5 * 0.65f);
                iArr[0] = i8;
                int i9 = (int) (i8 * 1.76d);
                i3 = 1;
                iArr[1] = i9;
            } else {
                i3 = 1;
                int i10 = (int) (i5 * 0.65f);
                iArr[0] = i10;
                iArr[1] = (int) (i10 * f2);
            }
            float f3 = i6 * 0.65f;
            if (iArr[i3] > f3) {
                int i11 = (int) f3;
                iArr[i3] = i11;
                i4 = 0;
                iArr[0] = (int) (i11 / f2);
            } else {
                i4 = 0;
            }
            int i12 = iArr[i4];
            int i13 = iArr[i3];
            marginLayoutParams.width = i12;
            marginLayoutParams.height = i13;
            if (C90193gN.LIZIZ(context)) {
                marginLayoutParams.leftMargin = i4;
            } else {
                marginLayoutParams.rightMargin = i4;
            }
            if (viewOnAttachStateChangeListenerC48975JJz.LJLLILLLL == i3) {
                marginLayoutParams.height = ((int) KL2.LIZJ(context, 50.0f)) + i13;
                viewOnAttachStateChangeListenerC48975JJz.LJLLLLLL.getLayoutParams().height = i13;
                viewOnAttachStateChangeListenerC48975JJz.itemView.setLayoutParams(marginLayoutParams);
                viewOnAttachStateChangeListenerC48975JJz.LJLLLL.getLayoutParams().width = i12;
                viewOnAttachStateChangeListenerC48975JJz.LJLLLL.getLayoutParams().height = i13;
                ViewGroup.LayoutParams layoutParams2 = viewOnAttachStateChangeListenerC48975JJz.LJZI.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((C018905p) layoutParams2).endToStart = R.id.her;
            } else {
                if (viewOnAttachStateChangeListenerC48975JJz.LJLLJ && width > height) {
                    viewOnAttachStateChangeListenerC48975JJz.LLD.getLayoutParams().width = (int) (i12 * 0.65d);
                }
                ViewGroup.LayoutParams layoutParams3 = viewOnAttachStateChangeListenerC48975JJz.LLD.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                C018905p c018905p = (C018905p) layoutParams3;
                c018905p.endToStart = R.id.ep8;
                c018905p.bottomToBottom = 0;
                c018905p.startToStart = 0;
                c018905p.setMarginStart((int) C78847Ux1.LJJIFFI(4));
                viewOnAttachStateChangeListenerC48975JJz.itemView.setLayoutParams(marginLayoutParams);
                viewOnAttachStateChangeListenerC48975JJz.LJLLLL.getLayoutParams().width = i12;
                viewOnAttachStateChangeListenerC48975JJz.LJLLLL.getLayoutParams().height = i13;
            }
        } else {
            Context context2 = viewOnAttachStateChangeListenerC48975JJz.itemView.getContext();
            ViewGroup.LayoutParams layoutParams4 = viewOnAttachStateChangeListenerC48975JJz.itemView.getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
            float f4 = viewOnAttachStateChangeListenerC48975JJz.LLIFFJFJJ;
            if (f4 > KL2.LIZJ(context2, 375.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2) {
                f = 16.0f;
            }
            int LIZJ3 = (int) KL2.LIZJ(context2, f);
            if (z4) {
                LIZJ = f4 * 0.53333336f;
            } else {
                LIZJ = KL2.LIZJ(context2, 200.0f);
            }
            int i14 = (int) LIZJ;
            int i15 = (int) (i14 * 1.7777778f);
            marginLayoutParams2.width = i14;
            marginLayoutParams2.height = i15;
            if (C90193gN.LIZIZ(context2)) {
                marginLayoutParams2.leftMargin = LIZJ3;
                marginLayoutParams2.rightMargin = 0;
            } else {
                marginLayoutParams2.leftMargin = 0;
                marginLayoutParams2.rightMargin = LIZJ3;
            }
            viewOnAttachStateChangeListenerC48975JJz.itemView.setLayoutParams(marginLayoutParams2);
            viewOnAttachStateChangeListenerC48975JJz.LJLLLL.getLayoutParams().width = i14;
            viewOnAttachStateChangeListenerC48975JJz.LJLLLL.getLayoutParams().height = i15;
        }
        viewOnAttachStateChangeListenerC48975JJz.LJZ.setText(C77123UOp.LJJIIJ(aweme4.getStatistics().getDiggCount()));
        Drawable LIZ = C242689fk.LIZ(viewOnAttachStateChangeListenerC48975JJz.itemView.getContext(), aweme4, R.drawable.c2j);
        if (!C90193gN.LIZIZ(GlobalContext.getContext())) {
            viewOnAttachStateChangeListenerC48975JJz.LJZ.setCompoundDrawablesWithIntrinsicBounds(LIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            viewOnAttachStateChangeListenerC48975JJz.LJZ.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ, (Drawable) null);
        }
        Video video2 = aweme4.getVideo();
        viewOnAttachStateChangeListenerC48975JJz.LJLLLL.setPlaceholderImage(R.drawable.bof);
        AbstractC48958JJi.M(aweme4, viewOnAttachStateChangeListenerC48975JJz.LJLLLL, video2, "SearchPreciseAdItemViewHolder");
        C59948Nfs c59948Nfs = viewOnAttachStateChangeListenerC48975JJz.LJLZ;
        if (c59948Nfs != null) {
            c59948Nfs.setVisibility(8);
            if (awemeRawAd != null) {
                C59946Nfq LIZ2 = NDH.LIZ();
                AwemeTextLabelModel label = awemeRawAd.getLabel();
                if (label != null && (labelName = label.getLabelName()) != null) {
                    c59948Nfs.setVisibility(0);
                    LIZ2.LJIIJ(labelName);
                    LIZ2.LJIIL(92);
                    LIZ2.LIZ(C78609UtB.LJJJ(R.attr.d7, c59948Nfs.getContext()));
                    LIZ2.LJIIJJI(C78609UtB.LJJJ(R.attr.dj, c59948Nfs.getContext()));
                    LIZ2.LIZIZ(C63081OpJ.LJIJJLI(c59948Nfs.getContext(), 3.0f));
                    C59947Nfr c59947Nfr = LIZ2.LIZ;
                    if (c59947Nfr != null) {
                        c59948Nfs.LIZ(c59947Nfr);
                    }
                }
            }
        }
        if (viewOnAttachStateChangeListenerC48975JJz.LJLLILLLL == 0) {
            viewOnAttachStateChangeListenerC48975JJz.LJZL.setVisibility(8);
            viewOnAttachStateChangeListenerC48975JJz.LLD.setVisibility(0);
            if (TextUtils.isEmpty(aweme4.getDesc())) {
                viewOnAttachStateChangeListenerC48975JJz.LLD.setText("");
                viewOnAttachStateChangeListenerC48975JJz.LLD.setVisibility(8);
            } else {
                viewOnAttachStateChangeListenerC48975JJz.LLD.setVisibility(0);
                viewOnAttachStateChangeListenerC48975JJz.LLD.setText(aweme4.getDesc());
                viewOnAttachStateChangeListenerC48975JJz.LLD.setMaxLines(2);
                C16880lQ.LJJJJI(viewOnAttachStateChangeListenerC48975JJz.LLD, new ACListenerS28S0100000_8(viewOnAttachStateChangeListenerC48975JJz, 67));
            }
        } else {
            viewOnAttachStateChangeListenerC48975JJz.LLD.setVisibility(8);
            viewOnAttachStateChangeListenerC48975JJz.LLF.setVisibility(8);
            if (TextUtils.isEmpty(aweme4.getDesc())) {
                viewOnAttachStateChangeListenerC48975JJz.LJZI.setText("");
                viewOnAttachStateChangeListenerC48975JJz.LJZI.setVisibility(8);
            } else {
                viewOnAttachStateChangeListenerC48975JJz.LJZL.setVisibility(0);
                viewOnAttachStateChangeListenerC48975JJz.LJZI.setVisibility(0);
                viewOnAttachStateChangeListenerC48975JJz.LJZI.setText(aweme4.getDesc());
                viewOnAttachStateChangeListenerC48975JJz.LJZI.setMaxLines(2);
                C16880lQ.LJJJJI(viewOnAttachStateChangeListenerC48975JJz.LJZI, new ACListenerS28S0100000_8(viewOnAttachStateChangeListenerC48975JJz, 68));
            }
        }
        viewOnAttachStateChangeListenerC48975JJz.LLFZ = new C49448Jau(new C49381JZp(viewOnAttachStateChangeListenerC48975JJz));
        Aweme aweme6 = viewOnAttachStateChangeListenerC48975JJz.LJLL;
        if (aweme6 != null && aweme6.getHighlightInfoList() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i16 = viewOnAttachStateChangeListenerC48975JJz.LJLLILLLL;
        if (i16 == 1) {
            tuxTextView = viewOnAttachStateChangeListenerC48975JJz.LJZI;
        } else {
            tuxTextView = viewOnAttachStateChangeListenerC48975JJz.LLD;
        }
        if (i16 == 1) {
            LJJJ = C78609UtB.LJJJ(R.attr.gu, viewOnAttachStateChangeListenerC48975JJz.itemView.getContext());
        } else {
            LJJJ = C78609UtB.LJJJ(R.attr.dl, viewOnAttachStateChangeListenerC48975JJz.itemView.getContext());
        }
        if (z5 && tuxTextView != null) {
            tuxTextView.setTextColor(LJJJ);
            tuxTextView.setTuxFont(41);
        }
        Aweme aweme7 = viewOnAttachStateChangeListenerC48975JJz.LJLL;
        if (aweme7 != null && (searchDesc = aweme7.getSearchDesc()) != null) {
            if (z5 && (aweme = viewOnAttachStateChangeListenerC48975JJz.LJLL) != null && aweme.getHighlightInfoList() != null) {
                C49448Jau c49448Jau = viewOnAttachStateChangeListenerC48975JJz.LLFZ;
                if (c49448Jau != null) {
                    spannableString = new SpannableString(searchDesc);
                    c49448Jau.LIZ(spannableString, "search_desc", 0);
                } else {
                    o.LJIJI("highlightHelper");
                    throw null;
                }
            } else {
                spannableString = new SpannableString(searchDesc);
            }
        } else {
            String str = null;
            Aweme aweme8 = viewOnAttachStateChangeListenerC48975JJz.LJLL;
            if (aweme8 != null) {
                str = aweme8.getDesc();
            }
            spannableString = new SpannableString(str);
        }
        tuxTextView.setText(spannableString);
        JJK jjk = this.LJLJJLL;
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        jjk.LIZIZ(i, view, aweme4, this.LJLLJ);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        JIB provider = this.LJLJL;
        C49153JQv scrollStateManager = this.LJLJLJ;
        JGK searchVideoUIListenerBridge = this.LJLJLLL;
        o.LJIIIZ(provider, "provider");
        o.LJIIIZ(scrollStateManager, "scrollStateManager");
        o.LJIIIZ(searchVideoUIListenerBridge, "searchVideoUIListenerBridge");
        ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz = new ViewOnAttachStateChangeListenerC48975JJz(C50365Jph.LIZIZ(R.layout.cex, parent), provider, scrollStateManager, this, parent, searchVideoUIListenerBridge);
        C0AX.LIZ(parent, viewOnAttachStateChangeListenerC48975JJz.itemView, R.id.lj7);
        View view = viewOnAttachStateChangeListenerC48975JJz.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewOnAttachStateChangeListenerC48975JJz.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnAttachStateChangeListenerC48975JJz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewOnAttachStateChangeListenerC48975JJz.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewOnAttachStateChangeListenerC48975JJz.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ViewOnAttachStateChangeListenerC48975JJz.class.getName();
        return viewOnAttachStateChangeListenerC48975JJz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JK5(Context context, JPH aweeClickListener, JPH listener, JIB mContainerStausProvider, C49153JQv mScrollStateManager, RecyclerView mRecyclerView, JGK mSearchVideoUIListenerBridge) {
        super(mRecyclerView);
        o.LJIIIZ(aweeClickListener, "aweeClickListener");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(mContainerStausProvider, "mContainerStausProvider");
        o.LJIIIZ(mScrollStateManager, "mScrollStateManager");
        o.LJIIIZ(mRecyclerView, "mRecyclerView");
        o.LJIIIZ(mSearchVideoUIListenerBridge, "mSearchVideoUIListenerBridge");
        this.LJLJJI = context;
        this.LJLJJL = aweeClickListener;
        this.LJLJJLL = listener;
        this.LJLJL = mContainerStausProvider;
        this.LJLJLJ = mScrollStateManager;
        this.LJLJLLL = mSearchVideoUIListenerBridge;
        this.LJLL = new JQA();
        this.LJLLILLLL = new JLZ<>(mRecyclerView);
        this.LJLLJ = new ArrayList();
    }
}
