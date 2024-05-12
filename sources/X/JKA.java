package X;

import Y.ACListenerS25S0201000_8;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKA extends JLX {
    public final Context LJLJJI;
    public final JJK LJLJJL;
    public final JJK LJLJJLL;
    public final JIB LJLJL;
    public final C49153JQv LJLJLJ;
    public final JGK LJLJLLL;
    public JQA LJLL;
    public String LJLLI;
    public final JLY<Aweme> LJLLILLLL;
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
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            Aweme aweme = (Aweme) ListProtector.get(this.LJLLJ, bindingAdapterPosition);
            JJK jjk = this.LJLJJLL;
            View view = viewHolder.itemView;
            o.LJIIIIZZ(view, "viewHolder.itemView");
            jjk.LIZIZ(bindingAdapterPosition, view, aweme, this.LJLLJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        float LIZJ;
        UrlModel urlModel;
        String desc;
        Object obj;
        Object obj2;
        JQA jqa;
        C48881JGj v;
        Aweme aweme;
        Video video;
        char c;
        int i2;
        Aweme aweme2;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (!(viewHolder instanceof JKB)) {
            return;
        }
        Aweme item = (Aweme) ListProtector.get(this.LJLLJ, i);
        JKB jkb = (JKB) viewHolder;
        jkb.LJLJL = this.LJLJI;
        String docId = this.LJLLI;
        JQA jqa2 = this.LJLL;
        boolean z3 = true;
        if (this.LJLLJ.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != getItemCount() - 1) {
            z3 = false;
        }
        ACListenerS25S0201000_8 aCListenerS25S0201000_8 = new ACListenerS25S0201000_8(i, this, item, 0);
        o.LJIIIZ(docId, "docId");
        o.LJIIIZ(item, "item");
        if (jqa2 != null) {
            jqa2.LJIJJLI = "tt_trendingcontent";
        }
        jkb.itemView.getContext();
        C48881JGj v2 = jkb.v();
        if (v2 != null) {
            v2.LJJ = i;
        }
        if (jkb.v() != null) {
            C49503Jbn.LIZIZ();
        }
        C48881JGj v3 = jkb.v();
        if (v3 != null) {
            v3.LJIJJLI = jqa2;
        }
        C48881JGj v4 = jkb.v();
        if (v4 != null) {
            v4.LJII(docId);
        }
        C48881JGj v6 = jkb.v();
        if (v6 != null) {
            v6.LJIILJJIL = jkb.LJLJLLL;
        }
        C48912JHo LLLIIII = jkb.LLLIIII();
        if (LLLIIII != null) {
            LLLIIII.LJFF = jkb.getAdapterPosition();
        }
        jkb.LJLLI.LIZ(item);
        jkb.LJLLI.setVideoPlayerStatusListener(jkb.LL);
        float f = 16.0f;
        if (z && (v = jkb.v()) != null && (aweme = v.LIZJ) != null && aweme.getVideo() != null) {
            C48881JGj v7 = jkb.v();
            if (v7 != null && (aweme2 = v7.LIZJ) != null) {
                video = aweme2.getVideo();
            } else {
                video = null;
            }
            o.LJI(video);
            int width = video.getWidth();
            int height = video.getHeight();
            Context context = jkb.itemView.getContext();
            ViewGroup.LayoutParams layoutParams = jkb.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int[] iArr = new int[2];
            int i3 = jkb.LLD;
            int i4 = jkb.LLF;
            if (C32044Chs.LJ()) {
                i4 = C32044Chs.LJII();
                i3 = C32044Chs.LJIIIIZZ();
            }
            float LIZJ2 = KL2.LIZJ(context, 16.0f);
            float f2 = height / width;
            if (width > height) {
                int i5 = (int) (i3 - (LIZJ2 * 2));
                iArr[0] = i5;
                c = 1;
                iArr[1] = (int) (i5 * f2);
            } else {
                c = 1;
                int i6 = (int) (i3 * 0.72f);
                iArr[0] = i6;
                iArr[1] = (int) (i6 * f2);
            }
            float f3 = i4 * 0.72f;
            if (iArr[c] > f3) {
                int i7 = (int) f3;
                iArr[c] = i7;
                i2 = 0;
                iArr[0] = (int) (i7 / f2);
            } else {
                i2 = 0;
            }
            int i8 = iArr[i2];
            int i9 = iArr[c];
            marginLayoutParams.width = i8;
            marginLayoutParams.height = i9;
            if (C90193gN.LIZIZ(context)) {
                marginLayoutParams.leftMargin = i2;
            } else {
                marginLayoutParams.rightMargin = i2;
            }
            jkb.itemView.setLayoutParams(marginLayoutParams);
            jkb.LJLLILLLL.getLayoutParams().width = i8;
            jkb.LJLLILLLL.getLayoutParams().height = i9;
        } else {
            Context context2 = jkb.itemView.getContext();
            ViewGroup.LayoutParams layoutParams2 = jkb.itemView.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            float f4 = jkb.LLD;
            if (f4 > KL2.LIZJ(context2, 375.0f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z3) {
                f = 8.0f;
            }
            int LIZJ3 = (int) KL2.LIZJ(context2, f);
            if (z2) {
                LIZJ = f4 * 0.53333336f;
            } else {
                LIZJ = KL2.LIZJ(context2, 200.0f);
            }
            int i10 = (int) LIZJ;
            int i11 = (int) (i10 * 1.7777778f);
            marginLayoutParams2.width = i10;
            marginLayoutParams2.height = i11;
            if (C90193gN.LIZIZ(context2)) {
                marginLayoutParams2.leftMargin = LIZJ3;
                marginLayoutParams2.rightMargin = 0;
            } else {
                marginLayoutParams2.leftMargin = 0;
                marginLayoutParams2.rightMargin = LIZJ3;
            }
            jkb.itemView.setLayoutParams(marginLayoutParams2);
            jkb.LJLLILLLL.getLayoutParams().width = i10;
            jkb.LJLLILLLL.getLayoutParams().height = i11;
        }
        jkb.LLFF = aCListenerS25S0201000_8;
        jkb.LJZI.setBackground(null);
        jkb.LJZ.setVisibility(8);
        jkb.LJLZ.setVisibility(0);
        jkb.LJLZ.setBackground(C04270Et.LIZIZ(jkb.itemView.getContext(), R.drawable.c32));
        jkb.LJLLL.setText(C77123UOp.LJJIIJ(item.getStatistics().getDiggCount()));
        Drawable LIZ = C242689fk.LIZ(jkb.itemView.getContext(), item, R.drawable.c2j);
        if (!C90193gN.LIZIZ(GlobalContext.getContext())) {
            urlModel = null;
            jkb.LJLLL.setCompoundDrawablesWithIntrinsicBounds(LIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            urlModel = null;
            jkb.LJLLL.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ, (Drawable) null);
        }
        AbstractC48958JJi.M(item, jkb.LJLLILLLL, item.getVideo(), "SearchAladdinVideoItemViewHolder");
        User author = item.getAuthor();
        if (author != null) {
            if (EF7.LJII == 2) {
                jkb.LJLLLLLL.setText(author.getUniqueId());
            } else {
                jkb.LJLLLLLL.setText(author.getNickname());
            }
            if (!C90193gN.LIZIZ(jkb.LJLLLLLL.getContext())) {
                jkb.LJLLLLLL.setGravity(8388611);
            } else {
                jkb.LJLLLLLL.setGravity(8388613);
            }
            W5F LJI = C1JX.LJI(author);
            int[] LIZ2 = J7H.LIZ(100);
            o.LJI(LIZ2);
            LJI.LJIILIIL(LIZ2);
            LJI.LIZIZ("AbsCellViewHolder");
            LJI.LJJIIJ = jkb.LJLLLL;
            LJI.LJ();
        }
        long createTime = item.getCreateTime();
        if (createTime > 0) {
            jkb.LJLLJ.setText(C57105Mb7.LJFF(createTime * 1000, jkb.itemView.getContext()));
            jkb.LJLLJ.setVisibility(0);
        } else {
            jkb.LJLLJ.setVisibility(8);
        }
        JYG jyg = new JYG(jkb.LJLJL, urlModel, urlModel, urlModel, urlModel, urlModel, urlModel, 126, urlModel);
        jyg.setImgCover(item.getVideo().getCover());
        if (item.getSearchDesc() != null) {
            desc = item.getSearchDesc();
        } else {
            desc = item.getDesc();
        }
        jyg.setTitle(desc);
        jyg.setMultipleChoices(C51757KSz.LIZLLL(jyg.getFeedbackType()));
        OSZ[] oszArr = new OSZ[8];
        oszArr[0] = new OSZ("enter_from", "general_search");
        C48881JGj v8 = jkb.v();
        if (v8 != null) {
            obj = v8.LJIL;
        } else {
            obj = urlModel;
        }
        oszArr[1] = new OSZ("search_result_id", String.valueOf(obj));
        oszArr[2] = new OSZ("token_type", "tt_trendingcontent");
        oszArr[3] = new OSZ("is_aladdin", "1");
        C48881JGj v9 = jkb.v();
        if (v9 != null && (jqa = v9.LJIJJLI) != null) {
            obj2 = Integer.valueOf(jqa.LJIIL);
        } else {
            obj2 = urlModel;
        }
        oszArr[4] = new OSZ("rank", String.valueOf(obj2));
        oszArr[5] = new OSZ("list_result_type", "video");
        oszArr[6] = new OSZ("list_item_id", item.getAid());
        C48881JGj v10 = jkb.v();
        Object obj3 = urlModel;
        if (v10 != null) {
            obj3 = Integer.valueOf(v10.LJJ);
        }
        oszArr[7] = new OSZ("aladdin_rank", String.valueOf(obj3));
        jyg.setLogParams(C113554cx.LJJLIIIIJ(oszArr));
        jkb.LJLJJL = true;
        ConstraintLayout containerView = jkb.LJZL;
        o.LJIIIIZZ(containerView, "containerView");
        jkb.L(containerView, jyg, new IDTListenerS117S0100000_8(jkb, 0));
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
        JKB jkb = new JKB(C50365Jph.LIZIZ(R.layout.cew, parent), provider, scrollStateManager, this, parent, searchVideoUIListenerBridge);
        jkb.LJLL = this.LJLJJL;
        C0AX.LIZ(parent, jkb.itemView, R.id.lj7);
        View view = jkb.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (jkb.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(JKB.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) jkb.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(jkb.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = JKB.class.getName();
        return jkb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JKA(Context context, JPJ awemeClickListener, JPJ listener, JIB mContainerStatusProvider, C49153JQv mScrollStateManager, RecyclerView mRecyclerView, JGK mSearchVideoUIListenerBridge) {
        super(mRecyclerView);
        o.LJIIIZ(awemeClickListener, "awemeClickListener");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(mContainerStatusProvider, "mContainerStatusProvider");
        o.LJIIIZ(mScrollStateManager, "mScrollStateManager");
        o.LJIIIZ(mRecyclerView, "mRecyclerView");
        o.LJIIIZ(mSearchVideoUIListenerBridge, "mSearchVideoUIListenerBridge");
        this.LJLJJI = context;
        this.LJLJJL = awemeClickListener;
        this.LJLJJLL = listener;
        this.LJLJL = mContainerStatusProvider;
        this.LJLJLJ = mScrollStateManager;
        this.LJLJLLL = mSearchVideoUIListenerBridge;
        this.LJLL = new JQA();
        this.LJLLI = "";
        this.LJLLILLLL = new JLY<>(mRecyclerView);
        this.LJLLJ = new ArrayList();
    }
}
