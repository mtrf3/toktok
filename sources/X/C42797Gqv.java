package X;

import X.C42797Gqv;
import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagData;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagResponse;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42797Gqv extends FrameLayout implements InterfaceC42825GrN, Observer<AVRecommendHashTagResponse> {
    public C161806Wq LJLIL;
    public C85533Xh LJLILLLLZI;
    public GT7 LJLJI;
    public GHY LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final List<C42802Gr0> LJLJL;
    public InterfaceC156456Cb<? super C42802Gr0> LJLJLJ;
    public final C5H3 LJLJLLL;
    public C6CO LJLL;
    public C161566Vs LJLLI;

    private final C76800UCe getInitEventListener() {
        this.LJLJLLL.getValue();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC42825GrN
    public final void LLIIZ() {
        C161806Wq c161806Wq = this.LJLIL;
        if (c161806Wq != null) {
            c161806Wq.LJLI(0);
            this.LJLJJLL = false;
            LIZ(0);
            return;
        }
        o.LJIJI("mHashTagListView");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getInitEventListener();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.3Xh] */
    public C42797Gqv(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJJLL = true;
        ArrayList arrayList = new ArrayList();
        this.LJLJL = arrayList;
        this.LJLJLLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS152S0100000_2(this, 52));
        C16880lQ.LLLZIIL(R.layout.bk6, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.e2w);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.hashtag_list_view)");
        C161806Wq c161806Wq = (C161806Wq) findViewById;
        this.LJLIL = c161806Wq;
        getContext();
        c161806Wq.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerListView$initView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIJJLI() {
                return C42797Gqv.this.LJLJJLL;
            }

            {
                super(0, false);
            }
        });
        this.LJLILLLLZI = new AbstractC029409q<C85543Xi>() { // from class: X.3Xh
            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return 10;
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(C85543Xi vh, int i) {
                o.LJIIIZ(vh, "vh");
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, X.3Xi] */
            @Override // X.AbstractC029409q
            public final C85543Xi onCreateViewHolder(ViewGroup root, int i) {
                o.LJIIIZ(root, "root");
                final View LIZIZ = C1FL.LIZIZ(root, R.layout.j_, root, false, "from(parent.context).inf…r_loading, parent, false)");
                ?? r2 = new RecyclerView.ViewHolder(LIZIZ) { // from class: X.3Xi
                };
                C0AX.LIZ(root, r2.itemView, R.id.lj7);
                View view = r2.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(root));
                }
                try {
                    if (r2.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C85543Xi.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(root.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup = (ViewGroup) r2.itemView.getParent();
                            if (viewGroup != null) {
                                C16880lQ.LJLLL(r2.itemView, viewGroup);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C85543Xi.class.getName();
                return r2;
            }
        };
        this.LJLJI = new GT7(arrayList, new GTB(this));
        if (C78934UyQ.LJLIL.getChallengeService() == null) {
            this.LJLJJL = false;
            setVisibility(8);
            return;
        }
        this.LJLJJL = true;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Activity LIZ = C105574Cj.LIZ(context2);
        o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) LIZ;
        RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) ViewModelProviders.of(activityC45651qj).get(RecommendHashTagViewModel.class);
        if (recommendHashTagViewModel.LJLIL == null) {
            recommendHashTagViewModel.LJLIL = new MutableLiveData<>();
        }
        recommendHashTagViewModel.LJLIL.observe(activityC45651qj, new AObserverS75S0100000_7(activityC45651qj, LiveTryModeCountDownThresholdSetting.DEFAULT));
        this.LJLL = new C6CO(recommendHashTagViewModel);
        C42827GrP c42827GrP = new C42827GrP();
        c42827GrP.LJJ(new C43226Gxq());
        c42827GrP.LJLILLLLZI = new C42824GrM(this);
        this.LJLLI = new C161566Vs(c42827GrP);
    }

    public final void LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    C161806Wq c161806Wq = this.LJLIL;
                    if (c161806Wq != null) {
                        AbstractC029409q adapter = c161806Wq.getAdapter();
                        GT7 gt7 = this.LJLJI;
                        if (gt7 != null) {
                            if (!o.LJ(adapter, gt7)) {
                                C161806Wq c161806Wq2 = this.LJLIL;
                                if (c161806Wq2 != null) {
                                    GT7 gt72 = this.LJLJI;
                                    if (gt72 != null) {
                                        c161806Wq2.setAdapter(gt72);
                                    } else {
                                        o.LJIJI("mHashTagAdapter");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mHashTagListView");
                                    throw null;
                                }
                            }
                            setVisibility(0);
                            return;
                        }
                        o.LJIJI("mHashTagAdapter");
                        throw null;
                    }
                    o.LJIJI("mHashTagListView");
                    throw null;
                }
                C161806Wq c161806Wq3 = this.LJLIL;
                if (c161806Wq3 != null) {
                    AbstractC029409q adapter2 = c161806Wq3.getAdapter();
                    C85533Xh c85533Xh = this.LJLILLLLZI;
                    if (c85533Xh != null) {
                        if (!o.LJ(adapter2, c85533Xh)) {
                            C161806Wq c161806Wq4 = this.LJLIL;
                            if (c161806Wq4 != null) {
                                C85533Xh c85533Xh2 = this.LJLILLLLZI;
                                if (c85533Xh2 != null) {
                                    c161806Wq4.setAdapter(c85533Xh2);
                                } else {
                                    o.LJIJI("mLoadingHashTagAdapter");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mHashTagListView");
                                throw null;
                            }
                        }
                        setVisibility(8);
                        return;
                    }
                    o.LJIJI("mLoadingHashTagAdapter");
                    throw null;
                }
                o.LJIJI("mHashTagListView");
                throw null;
            }
            C161806Wq c161806Wq5 = this.LJLIL;
            if (c161806Wq5 != null) {
                AbstractC029409q adapter3 = c161806Wq5.getAdapter();
                C85533Xh c85533Xh3 = this.LJLILLLLZI;
                if (c85533Xh3 != null) {
                    if (!o.LJ(adapter3, c85533Xh3)) {
                        C161806Wq c161806Wq6 = this.LJLIL;
                        if (c161806Wq6 != null) {
                            C85533Xh c85533Xh4 = this.LJLILLLLZI;
                            if (c85533Xh4 != null) {
                                c161806Wq6.setAdapter(c85533Xh4);
                            } else {
                                o.LJIJI("mLoadingHashTagAdapter");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mHashTagListView");
                            throw null;
                        }
                    }
                    setVisibility(8);
                    return;
                }
                o.LJIJI("mLoadingHashTagAdapter");
                throw null;
            }
            o.LJIJI("mHashTagListView");
            throw null;
        }
        C161806Wq c161806Wq7 = this.LJLIL;
        if (c161806Wq7 != null) {
            AbstractC029409q adapter4 = c161806Wq7.getAdapter();
            C85533Xh c85533Xh5 = this.LJLILLLLZI;
            if (c85533Xh5 != null) {
                if (!o.LJ(adapter4, c85533Xh5)) {
                    C161806Wq c161806Wq8 = this.LJLIL;
                    if (c161806Wq8 != null) {
                        C85533Xh c85533Xh6 = this.LJLILLLLZI;
                        if (c85533Xh6 != null) {
                            c161806Wq8.setAdapter(c85533Xh6);
                        } else {
                            o.LJIJI("mLoadingHashTagAdapter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mHashTagListView");
                        throw null;
                    }
                }
                setVisibility(0);
                return;
            }
            o.LJIJI("mLoadingHashTagAdapter");
            throw null;
        }
        o.LJIJI("mHashTagListView");
        throw null;
    }

    @Override // X.InterfaceC42825GrN
    public final void LLJJI(Exception exc) {
        LIZ(1);
    }

    @Override // X.InterfaceC42825GrN
    public final void LLJJIII(AVSearchChallengeList aVSearchChallengeList) {
        List<AVSearchChallenge> list;
        if (aVSearchChallengeList != null) {
            list = aVSearchChallengeList.items;
        } else {
            list = null;
        }
        ((ArrayList) this.LJLJL).clear();
        if (list == null || list.isEmpty()) {
            LIZ(2);
        } else {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ArrayList) this.LJLJL).add(C42802Gr0.LIZ((AVSearchChallenge) ListProtector.get(list, i)));
            }
            this.LJLJJLL = true;
            LIZ(3);
        }
        C161806Wq c161806Wq = this.LJLIL;
        if (c161806Wq != null) {
            c161806Wq.LJLI(0);
        } else {
            o.LJIJI("mHashTagListView");
            throw null;
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(AVRecommendHashTagResponse aVRecommendHashTagResponse) {
        boolean z;
        if (aVRecommendHashTagResponse != null) {
            C6CO c6co = this.LJLL;
            if (c6co != null) {
                RecommendHashTagViewModel recommendHashTagViewModel = c6co.LIZ;
                if (recommendHashTagViewModel.LJLIL == null) {
                    recommendHashTagViewModel.LJLIL = new MutableLiveData<>();
                }
                AVRecommendHashTagResponse LIZ = C42798Gqw.LIZ(recommendHashTagViewModel.LJLIL.getValue());
                if (LIZ == null) {
                    LIZ(1);
                    return;
                }
                LinkedList linkedList = new LinkedList();
                boolean z2 = LIZ.needHistory;
                boolean z3 = LIZ.needPrivacyHistory;
                int i = LIZ.showPrivacyCount;
                List<? extends AVRecommendHashTagData> list = LIZ.data;
                new ArrayList();
                if (z2) {
                    C60903NvH.LJIIJJI().getLocalHashTagService().getClass();
                } else if (z3 && i > 0) {
                    C60903NvH.LJIIJJI().getLocalHashTagService().getClass();
                    throw null;
                }
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    HashSet hashSet = new HashSet();
                    for (AVRecommendHashTagData aVRecommendHashTagData : list) {
                        if (!hashSet.contains(aVRecommendHashTagData.challenge.challengeName)) {
                            C42802Gr0 c42802Gr0 = new C42802Gr0();
                            c42802Gr0.LIZIZ = 2;
                            int i2 = aVRecommendHashTagData.mark;
                            if (i2 == 4) {
                                c42802Gr0.LJFF = "history";
                            } else if (i2 == 0) {
                                c42802Gr0.LJFF = "recommendation";
                            } else {
                                c42802Gr0.LJFF = "commercial";
                            }
                            c42802Gr0.LIZ = aVRecommendHashTagData.challenge;
                            c42802Gr0.LJ = aVRecommendHashTagData.LIZ;
                            if (aVRecommendHashTagData.pos > linkedList.size()) {
                                linkedList.add(c42802Gr0);
                            } else {
                                int i3 = aVRecommendHashTagData.pos;
                                if (i3 < 0) {
                                    ListProtector.add(linkedList, 0, c42802Gr0);
                                } else {
                                    ListProtector.add(linkedList, i3, c42802Gr0);
                                }
                            }
                        }
                    }
                }
                if (linkedList.isEmpty()) {
                    LIZ(2);
                    return;
                }
                ((ArrayList) this.LJLJL).clear();
                ((ArrayList) this.LJLJL).addAll(linkedList);
                this.LJLJJLL = true;
                LIZ(3);
                C161806Wq c161806Wq = this.LJLIL;
                if (c161806Wq != null) {
                    c161806Wq.LJLI(0);
                    return;
                } else {
                    o.LJIJI("mHashTagListView");
                    throw null;
                }
            }
            o.LJIJI("recommendHashTagViewModel");
            throw null;
        }
    }

    public final void setOnHashTagItemClickListener(InterfaceC156456Cb<? super C42802Gr0> interfaceC156456Cb) {
        this.LJLJLJ = interfaceC156456Cb;
    }
}
