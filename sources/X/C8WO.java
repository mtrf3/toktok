package X;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting;
import com.ss.android.ugc.aweme.mention.ui.cell.CommentMentionCell;
import com.ss.android.ugc.aweme.mention.ui.page.CommentMentionHorizontalCell;
import com.ss.android.ugc.aweme.mention.viewmodel.CommentMentionViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8WO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8WO implements C70G {
    public CommentMentionViewModel LIZ;
    public C8WT LIZIZ;
    public boolean LIZJ;

    @Override // X.C70G
    public final void LIZJ(boolean z) {
        C212808Wu mentionSearchLayout;
        C212808Wu mentionSearchLayout2;
        if (z) {
            C8WT c8wt = this.LIZIZ;
            if (c8wt != null && (mentionSearchLayout2 = c8wt.getMentionSearchLayout()) != null) {
                mentionSearchLayout2.LIZIZ();
            }
        } else {
            C8WT c8wt2 = this.LIZIZ;
            if (c8wt2 != null && (mentionSearchLayout = c8wt2.getMentionSearchLayout()) != null) {
                mentionSearchLayout.LIZ();
            }
        }
        this.LIZJ = z;
    }

    @Override // X.C70G
    public final void LIZLLL(java.util.Set<String> set) {
        CommentMentionViewModel commentMentionViewModel = this.LIZ;
        if (commentMentionViewModel != null) {
            commentMentionViewModel.LJLJJL.clear();
            commentMentionViewModel.LJLJJL.addAll(set);
        }
    }

    @Override // X.C70G
    public final void LJFF(C1794472m c1794472m) {
        CommentMentionViewModel commentMentionViewModel = this.LIZ;
        if (commentMentionViewModel == null) {
            return;
        }
        commentMentionViewModel.LJLJL = c1794472m;
    }

    @Override // X.C70G
    public final void LJI(int i) {
        C212808Wu mentionSearchLayout;
        C212808Wu mentionSearchLayout2;
        ViewGroup.LayoutParams layoutParams;
        C8WT c8wt = this.LIZIZ;
        if (c8wt != null && (mentionSearchLayout2 = c8wt.getMentionSearchLayout()) != null && (layoutParams = mentionSearchLayout2.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        C8WT c8wt2 = this.LIZIZ;
        if (c8wt2 != null && (mentionSearchLayout = c8wt2.getMentionSearchLayout()) != null) {
            mentionSearchLayout.setInitValue(i);
        }
    }

    @Override // X.C70G
    public final void LIZ(int i, Editable editable) {
        C217268fq c217268fq;
        C212808Wu mentionSearchLayout;
        C212808Wu mentionSearchLayout2;
        C212808Wu mentionSearchLayout3;
        String LIZ = C118264kY.LIZ(i, editable, true);
        if (this.LIZJ && LIZ != null) {
            if (CommentSampleRateSetting.LIZ(0.15f, "mention_panel_load_time")) {
                C8WR c8wr = C8WS.LIZIZ;
                c8wr.LIZIZ = -1L;
                c8wr.LIZ = -1L;
                c8wr.LJ = false;
                c8wr.LIZ = System.currentTimeMillis();
            }
            C8WT c8wt = this.LIZIZ;
            if (c8wt != null && (mentionSearchLayout3 = c8wt.getMentionSearchLayout()) != null) {
                mentionSearchLayout3.LIZIZ();
            }
        }
        C8WT c8wt2 = this.LIZIZ;
        if (c8wt2 != null && (mentionSearchLayout2 = c8wt2.getMentionSearchLayout()) != null && mentionSearchLayout2.LJLILLLLZI) {
            return;
        }
        if (LIZ == null) {
            CommentMentionViewModel commentMentionViewModel = this.LIZ;
            if (commentMentionViewModel != null && (c217268fq = commentMentionViewModel.LJLIL) != null) {
                C8WO c8wo = c217268fq.LIZ;
                c8wo.LIZJ = false;
                C8WT c8wt3 = c8wo.LIZIZ;
                if (c8wt3 != null && (mentionSearchLayout = c8wt3.getMentionSearchLayout()) != null) {
                    mentionSearchLayout.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        CommentMentionViewModel commentMentionViewModel2 = this.LIZ;
        if (commentMentionViewModel2 == null) {
            return;
        }
        commentMentionViewModel2.LJLJJI = LIZ;
        ((PowerPageSource) commentMentionViewModel2.LJLJLJ.getValue()).getOperator().refresh();
    }

    @Override // X.C70G
    public final String LIZIZ(int i, Editable editable, boolean z) {
        return C118264kY.LIZ(i, editable, z);
    }

    @Override // X.C70G
    public final C8WT LJ(Context context, ViewGroup container, C70R c70r) {
        o.LJIIIZ(container, "container");
        C8WT c8wt = new C8WT(context);
        c8wt.setCommentMentionConfig(c70r);
        c8wt.getMentionSearchLayout().setVisibilityChangeListener(C7DP.LJLIL);
        if (c8wt.getParent() != null) {
            ViewParent parent = c8wt.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(c8wt, (ViewGroup) parent);
        }
        container.addView(c8wt);
        this.LIZIZ = c8wt;
        this.LIZ = new CommentMentionViewModel();
        this.LIZJ = false;
        return this.LIZIZ;
    }

    @Override // X.C70G
    public final void LJII(final Context context, final Fragment fragment, java.util.Set<String> set, View.OnClickListener onClickListener, final InterfaceC88472Yns<? super User, C76800UCe> interfaceC88472Yns, final InterfaceC88474Ynu<? super User, ? super Integer, ? super String, ? super Boolean, Boolean> interfaceC88474Ynu, InterfaceC88472Yns<? super String, Boolean> interfaceC88472Yns2) {
        int i;
        Class<? extends PowerCell<?>> cls;
        AbstractC72278SYg<?> abstractC72278SYg;
        SYL mentionList;
        AbstractC72278SYg<?> abstractC72278SYg2;
        C70R c70r;
        o.LJIIIZ(fragment, "fragment");
        if (this.LIZ == null) {
            this.LIZ = new CommentMentionViewModel();
        }
        CommentMentionViewModel commentMentionViewModel = this.LIZ;
        if (commentMentionViewModel != null) {
            C8WT c8wt = this.LIZIZ;
            if (c8wt != null) {
                c70r = c8wt.getCommentMentionConfig();
            } else {
                c70r = null;
            }
            commentMentionViewModel.LJLJJLL = c70r;
        }
        C8WT c8wt2 = this.LIZIZ;
        if (c8wt2 != null && (mentionList = c8wt2.getMentionList()) != null) {
            mentionList.setLayoutManager(new LinearLayoutManager());
            mentionList.LLLF.LJZL(CommentMentionCell.class);
            mentionList.setItemAnimator(null);
            CommentMentionViewModel commentMentionViewModel2 = this.LIZ;
            if (commentMentionViewModel2 != null && (abstractC72278SYg2 = (AbstractC72278SYg) commentMentionViewModel2.LJLJLJ.getValue()) != null) {
                mentionList.LJLJLLL(abstractC72278SYg2);
            }
            mentionList.LJLJLJ(new C72300SZc() { // from class: X.8WP
                @Override // X.C72300SZc
                public final void LIZLLL() {
                    C26045AKb c26045AKb = new C26045AKb(fragment);
                    c26045AKb.LJIIIIZZ(R.string.hvd);
                    c26045AKb.LJIIJ();
                }

                @Override // X.C72300SZc
                public final void LJII() {
                    SYL mentionList2;
                    C72808Sho<InterfaceC57784Mm4> state;
                    C8WT c8wt3 = C8WO.this.LIZIZ;
                    if (c8wt3 != null && (mentionList2 = c8wt3.getMentionList()) != null && (state = mentionList2.getState()) != null) {
                        state.LJFF();
                    }
                }

                @Override // X.C72300SZc
                public final void LJIIIIZZ() {
                    SYL mentionList2;
                    C8WT c8wt3 = C8WO.this.LIZIZ;
                    if (c8wt3 != null && (mentionList2 = c8wt3.getMentionList()) != null) {
                        mentionList2.LJLI(0);
                    }
                    C8WS.LIZIZ.LIZIZ = System.currentTimeMillis();
                    C10K.LIZJ(new Callable() { // from class: X.8WQ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C8WR c8wr = C8WS.LIZIZ;
                            long j = c8wr.LIZIZ;
                            if (j >= 0) {
                                long j2 = c8wr.LIZ;
                                if (j2 > 0 && j - j2 > 0) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("duration", c8wr.LIZIZ - c8wr.LIZ);
                                    jSONObject.put("duration_before_network", c8wr.LIZJ - c8wr.LIZ);
                                    jSONObject.put("duration_network", c8wr.LIZLLL - c8wr.LIZJ);
                                    jSONObject.put("duration_after_network", c8wr.LIZIZ - c8wr.LIZLLL);
                                    jSONObject.put("use_cache", c8wr.LJ);
                                    jSONObject.put("is_first_enter", C8WS.LIZ ? 1 : 0);
                                    FMX.LJIILJJIL("mention_panel_load_time", jSONObject);
                                }
                            }
                            c8wr.LIZIZ = -1L;
                            c8wr.LIZ = -1L;
                            c8wr.LJ = false;
                            C8WS.LIZ = false;
                            return C76800UCe.LIZ;
                        }
                    });
                }

                @Override // X.C72300SZc
                public final void LJI(Exception exc) {
                    C26045AKb c26045AKb = new C26045AKb(fragment);
                    c26045AKb.LJIIIIZZ(R.string.hvd);
                    c26045AKb.LJIIJ();
                }
            });
        }
        CommentMentionViewModel commentMentionViewModel3 = this.LIZ;
        if (commentMentionViewModel3 != null) {
            commentMentionViewModel3.LJLJJL.clear();
            commentMentionViewModel3.LJLJJL.addAll(set);
        }
        C8WT c8wt3 = this.LIZIZ;
        if (c8wt3 != null) {
            CommentMentionViewModel commentMentionViewModel4 = this.LIZ;
            final SYL mentionList2 = c8wt3.getMentionList();
            c8wt3.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            C70R c70r2 = c8wt3.LJLJJI;
            if (c70r2 != null && c70r2.LJLIL) {
                i = 1;
            } else {
                i = 0;
            }
            linearLayoutManager.LLJJIII(i ^ 1);
            mentionList2.setLayoutManager(linearLayoutManager);
            Class<? extends PowerCell<?>>[] clsArr = new Class[1];
            C70R c70r3 = c8wt3.LJLJJI;
            if (c70r3 != null && c70r3.LJLIL) {
                cls = CommentMentionHorizontalCell.class;
            } else {
                cls = CommentMentionCell.class;
            }
            clsArr[0] = cls;
            mentionList2.LLLF.LJZL(clsArr);
            mentionList2.setItemAnimator(null);
            if (commentMentionViewModel4 != null && (abstractC72278SYg = (AbstractC72278SYg) commentMentionViewModel4.LJLJLJ.getValue()) != null) {
                mentionList2.LJLJLLL(abstractC72278SYg);
            }
            mentionList2.LJLJLJ(new C72300SZc() { // from class: X.76h
                @Override // X.C72300SZc
                public final void LIZLLL() {
                    C26045AKb c26045AKb = new C26045AKb(fragment);
                    c26045AKb.LJIIIIZZ(R.string.hvd);
                    c26045AKb.LJIIJ();
                }

                @Override // X.C72300SZc
                public final void LJII() {
                    C72808Sho<InterfaceC57784Mm4> state = SYL.this.getState();
                    if (state != null) {
                        state.LJFF();
                    }
                }

                @Override // X.C72300SZc
                public final void LJIIIIZZ() {
                    SYL.this.LJLI(0);
                }

                @Override // X.C72300SZc
                public final void LJI(Exception exc) {
                    C26045AKb c26045AKb = new C26045AKb(fragment);
                    c26045AKb.LJIIIIZZ(R.string.hvd);
                    c26045AKb.LJIIJ();
                }
            });
        }
        CommentMentionViewModel commentMentionViewModel5 = this.LIZ;
        if (commentMentionViewModel5 != null) {
            commentMentionViewModel5.LJLIL = new C217268fq(this, onClickListener, interfaceC88472Yns2);
        }
        C8WT c8wt4 = this.LIZIZ;
        if (c8wt4 == null) {
            return;
        }
        c8wt4.setItemActionListener(new C8WV() { // from class: X.8WW
            @Override // X.C8WV
            public final void LIZ(Y9G y9g) {
                InterfaceC88472Yns<User, C76800UCe> interfaceC88472Yns3;
                C212808Wu mentionSearchLayout;
                if (y9g == null) {
                    return;
                }
                if (!C48203Ivv.LJ(context)) {
                    C26045AKb c26045AKb = new C26045AKb(fragment);
                    c26045AKb.LJIIIIZZ(R.string.img);
                    c26045AKb.LJIIJ();
                    return;
                }
                C8WT c8wt5 = C8WO.this.LIZIZ;
                if ((c8wt5 == null || (mentionSearchLayout = c8wt5.getMentionSearchLayout()) == null || !mentionSearchLayout.LJLIL) && (interfaceC88472Yns3 = interfaceC88472Yns) != null) {
                    interfaceC88472Yns3.invoke(Y9H.LIZJ(y9g));
                }
            }

            @Override // X.C8WV
            public final void LIZIZ(int i2, Y9G item, boolean z) {
                C212808Wu mentionSearchLayout;
                o.LJIIIZ(item, "item");
                C8WO c8wo = C8WO.this;
                if (!c8wo.LIZJ) {
                    return;
                }
                C8WT c8wt5 = c8wo.LIZIZ;
                if (c8wt5 != null && (mentionSearchLayout = c8wt5.getMentionSearchLayout()) != null && mentionSearchLayout.LJLIL) {
                    return;
                }
                if (!item.LJIJI.LIZ) {
                    C26045AKb c26045AKb = new C26045AKb(fragment);
                    c26045AKb.LJIIIIZZ(R.string.i2p);
                    c26045AKb.LJIIJ();
                    return;
                }
                C8WO c8wo2 = C8WO.this;
                if (c8wo2.LIZIZ == null) {
                    return;
                }
                boolean booleanValue = interfaceC88474Ynu.invoke(Y9H.LIZJ(item), Integer.valueOf(i2), "", Boolean.valueOf(z)).booleanValue();
                CommentMentionViewModel commentMentionViewModel6 = c8wo2.LIZ;
                if (commentMentionViewModel6 == null) {
                    return;
                }
                if (booleanValue && z) {
                    commentMentionViewModel6.LJLJJL.add(item.LIZ);
                } else {
                    commentMentionViewModel6.LJLJJL.remove(item.LIZ);
                }
            }
        });
    }
}
