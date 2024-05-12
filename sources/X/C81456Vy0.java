package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.panel.model.CommentStickerForPanel;
import com.ss.android.ugc.aweme.panel.model.CommentStickerPanelData;
import com.ss.android.ugc.aweme.panel.model.MixedQuestionCollection;
import com.ss.android.ugc.aweme.panel.model.QuestionCollection;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vy0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81456Vy0<T> implements InterfaceC29911Fj {
    public final /* synthetic */ C81455Vxz LJLIL;

    public C81456Vy0(C81455Vxz c81455Vxz) {
        this.LJLIL = c81455Vxz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        QuestionCollection questionCollection;
        List<QaStruct> list;
        List list2;
        int i;
        int i2;
        CommentStickerPanelData commentStickerPanelData;
        List<CommentStickerForPanel> list3;
        ?? r7;
        int i3;
        Integer num;
        Integer num2;
        List<CommentStickerForPanel> list4;
        int i4 = 4;
        boolean z = true;
        switch (C81459Vy3.LIZ[this.LJLIL.getItemType().ordinal()]) {
            case 1:
            case 2:
                T4X t4x = this.LJLIL.LJLJLJ;
                if (t4x != null) {
                    if (t4x.LJLJJL) {
                        t4x.LIZJ();
                        T4X t4x2 = this.LJLIL.LJLJLJ;
                        if (t4x2 != null) {
                            t4x2.setVisibility(8);
                        } else {
                            o.LJIJI("loadMoreDoubleBall");
                            throw null;
                        }
                    }
                    if (!(obj instanceof CommentStickerPanelData) || (commentStickerPanelData = (CommentStickerPanelData) obj) == null || (list3 = commentStickerPanelData.commentStickerPanelList) == null || list3.isEmpty()) {
                        if (((ArrayList) this.LJLIL.LJLLLL).isEmpty()) {
                            this.LJLIL.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    this.LJLIL.setVisibility(0);
                    int size = ((ArrayList) this.LJLIL.LJLLLL).size();
                    List<Object> list5 = this.LJLIL.LJLLLL;
                    if (commentStickerPanelData != null && (list4 = commentStickerPanelData.commentStickerPanelList) != null) {
                        r7 = new ArrayList(C32I.LJJL(list4, 10));
                        Iterator<CommentStickerForPanel> it = list4.iterator();
                        while (it.hasNext()) {
                            r7.add(HJN.LIZ(it.next()));
                        }
                    } else {
                        r7 = C61878OQg.INSTANCE;
                    }
                    ((ArrayList) list5).addAll(r7);
                    C81455Vxz c81455Vxz = this.LJLIL;
                    if (commentStickerPanelData != null && (num2 = commentStickerPanelData.cursor) != null) {
                        i3 = num2.intValue();
                    } else {
                        i3 = c81455Vxz.LJLLI;
                    }
                    c81455Vxz.LJLLI = i3;
                    C81455Vxz c81455Vxz2 = this.LJLIL;
                    if (commentStickerPanelData == null || (num = commentStickerPanelData.hasMore) == null || num.intValue() != 1) {
                        z = false;
                    }
                    c81455Vxz2.LJLLILLLL = z;
                    C81455Vxz c81455Vxz3 = this.LJLIL;
                    if (c81455Vxz3.LJLLILLLL) {
                        View view = c81455Vxz3.LJLJLLL;
                        if (view != null) {
                            view.setVisibility(0);
                            TuxTextView tuxTextView = this.LJLIL.LJLJL;
                            if (tuxTextView != null) {
                                tuxTextView.setVisibility(4);
                            } else {
                                o.LJIJI("loadMoreText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("loadMoreContainer");
                            throw null;
                        }
                    } else {
                        View view2 = c81455Vxz3.LJLJLLL;
                        if (view2 != null) {
                            view2.setVisibility(8);
                            TuxTextView tuxTextView2 = this.LJLIL.LJLJL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setVisibility(8);
                            } else {
                                o.LJIJI("loadMoreText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("loadMoreContainer");
                            throw null;
                        }
                    }
                    RecyclerView recyclerView = this.LJLIL.LJLJJLL;
                    if (recyclerView != null) {
                        AbstractC029409q adapter = recyclerView.getAdapter();
                        if (adapter == null) {
                            return;
                        }
                        adapter.notifyItemInserted(size);
                        return;
                    }
                    o.LJIJI("recycleView");
                    throw null;
                }
                o.LJIJI("loadMoreDoubleBall");
                throw null;
            case 3:
                T4X t4x3 = this.LJLIL.LJLJLJ;
                if (t4x3 != null) {
                    if (t4x3.LJLJJL) {
                        t4x3.LIZJ();
                        T4X t4x4 = this.LJLIL.LJLJLJ;
                        if (t4x4 != null) {
                            t4x4.setVisibility(8);
                        } else {
                            o.LJIJI("loadMoreDoubleBall");
                            throw null;
                        }
                    }
                    if (!(obj instanceof MixedQuestionCollection)) {
                        return;
                    }
                    MixedQuestionCollection mixedQuestionCollection = (MixedQuestionCollection) obj;
                    List<QaStruct> list6 = mixedQuestionCollection.questionStickerList;
                    if (list6 == null || list6.isEmpty()) {
                        if (((ArrayList) this.LJLIL.LJLLLL).isEmpty()) {
                            this.LJLIL.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    int size2 = ((ArrayList) this.LJLIL.LJLLLL).size();
                    List<Object> list7 = this.LJLIL.LJLZ;
                    Collection collection = mixedQuestionCollection.questionStickerList;
                    if (collection == null) {
                        collection = C61878OQg.INSTANCE;
                    }
                    ((ArrayList) list7).addAll(collection);
                    C81455Vxz c81455Vxz4 = this.LJLIL;
                    ((ArrayList) c81455Vxz4.LJLLLL).addAll(c81455Vxz4.LJLZ);
                    C81455Vxz c81455Vxz5 = this.LJLIL;
                    if (!mixedQuestionCollection.hasMore) {
                        z = false;
                    }
                    c81455Vxz5.LJLLJ = z;
                    if (I1R.LIZ()) {
                        C81455Vxz c81455Vxz6 = this.LJLIL;
                        if (c81455Vxz6.LJLLJ) {
                            View view3 = c81455Vxz6.LJLJLLL;
                            if (view3 != null) {
                                view3.setVisibility(0);
                                TuxTextView tuxTextView3 = this.LJLIL.LJLJL;
                                if (tuxTextView3 != null) {
                                    tuxTextView3.setVisibility(0);
                                } else {
                                    o.LJIJI("loadMoreText");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("loadMoreContainer");
                                throw null;
                            }
                        } else {
                            View view4 = c81455Vxz6.LJLJLLL;
                            if (view4 != null) {
                                view4.setVisibility(8);
                                TuxTextView tuxTextView4 = this.LJLIL.LJLJL;
                                if (tuxTextView4 != null) {
                                    tuxTextView4.setVisibility(8);
                                } else {
                                    o.LJIJI("loadMoreText");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("loadMoreContainer");
                                throw null;
                            }
                        }
                    } else {
                        C81455Vxz c81455Vxz7 = this.LJLIL;
                        if (c81455Vxz7.LJLLJ) {
                            View view5 = c81455Vxz7.LJLJLLL;
                            if (view5 != null) {
                                view5.setVisibility(0);
                                TuxTextView tuxTextView5 = this.LJLIL.LJLJL;
                                if (tuxTextView5 != null) {
                                    tuxTextView5.setVisibility(4);
                                } else {
                                    o.LJIJI("loadMoreText");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("loadMoreContainer");
                                throw null;
                            }
                        } else {
                            View view6 = c81455Vxz7.LJLJLLL;
                            if (view6 != null) {
                                view6.setVisibility(8);
                                TuxTextView tuxTextView6 = this.LJLIL.LJLJL;
                                if (tuxTextView6 != null) {
                                    tuxTextView6.setVisibility(8);
                                } else {
                                    o.LJIJI("loadMoreText");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("loadMoreContainer");
                                throw null;
                            }
                        }
                    }
                    RecyclerView recyclerView2 = this.LJLIL.LJLJJLL;
                    if (recyclerView2 != null) {
                        AbstractC029409q adapter2 = recyclerView2.getAdapter();
                        if (adapter2 == null) {
                            return;
                        }
                        adapter2.notifyItemInserted(size2);
                        return;
                    }
                    o.LJIJI("recycleView");
                    throw null;
                }
                o.LJIJI("loadMoreDoubleBall");
                throw null;
            case 4:
            case 5:
            case 6:
                T4X t4x5 = this.LJLIL.LJLJLJ;
                if (t4x5 != null) {
                    if (t4x5.LJLJJL) {
                        t4x5.LIZJ();
                        T4X t4x6 = this.LJLIL.LJLJLJ;
                        if (t4x6 != null) {
                            t4x6.setVisibility(8);
                        } else {
                            o.LJIJI("loadMoreDoubleBall");
                            throw null;
                        }
                    }
                    if (!(obj instanceof QuestionCollection) || (questionCollection = (QuestionCollection) obj) == null || (list = questionCollection.questionStickerStruct) == null || list.isEmpty()) {
                        if (((ArrayList) this.LJLIL.LJLLLL).isEmpty()) {
                            this.LJLIL.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    this.LJLIL.setVisibility(0);
                    int size3 = ((ArrayList) this.LJLIL.LJLLLL).size();
                    List<Object> list8 = this.LJLIL.LJLLLLLL;
                    if (questionCollection == null || (list2 = questionCollection.questionStickerStruct) == null) {
                        list2 = C61878OQg.INSTANCE;
                    }
                    ((ArrayList) list8).addAll(list2);
                    C81455Vxz c81455Vxz8 = this.LJLIL;
                    List<Object> list9 = c81455Vxz8.LJLLLL;
                    List<Object> list10 = c81455Vxz8.LJLLLLLL;
                    if (c81455Vxz8.LIZIZ()) {
                        i = 30;
                    } else {
                        i = 6;
                    }
                    ((ArrayList) list9).addAll(((ArrayList) list10).subList(size3, Math.min(i + size3, ((ArrayList) this.LJLIL.LJLLLLLL).size())));
                    C81455Vxz c81455Vxz9 = this.LJLIL;
                    if (questionCollection != null) {
                        i2 = questionCollection.cursor;
                    } else {
                        i2 = c81455Vxz9.LJLLI;
                    }
                    c81455Vxz9.LJLLI = i2;
                    if (questionCollection == null || questionCollection.hasMore != 1) {
                        z = false;
                    }
                    c81455Vxz9.LJLLILLLL = z;
                    if (z) {
                        View view7 = c81455Vxz9.LJLJLLL;
                        if (view7 != null) {
                            view7.setVisibility(0);
                            C81455Vxz c81455Vxz10 = this.LJLIL;
                            TuxTextView tuxTextView7 = c81455Vxz10.LJLJL;
                            if (tuxTextView7 != null) {
                                if (!c81455Vxz10.LIZIZ()) {
                                    i4 = 0;
                                }
                                tuxTextView7.setVisibility(i4);
                            } else {
                                o.LJIJI("loadMoreText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("loadMoreContainer");
                            throw null;
                        }
                    } else {
                        View view8 = c81455Vxz9.LJLJLLL;
                        if (view8 != null) {
                            view8.setVisibility(8);
                            TuxTextView tuxTextView8 = this.LJLIL.LJLJL;
                            if (tuxTextView8 != null) {
                                tuxTextView8.setVisibility(8);
                            } else {
                                o.LJIJI("loadMoreText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("loadMoreContainer");
                            throw null;
                        }
                    }
                    RecyclerView recyclerView3 = this.LJLIL.LJLJJLL;
                    if (recyclerView3 != null) {
                        AbstractC029409q adapter3 = recyclerView3.getAdapter();
                        if (adapter3 == null) {
                            return;
                        }
                        adapter3.notifyItemInserted(size3);
                        return;
                    }
                    o.LJIJI("recycleView");
                    throw null;
                }
                o.LJIJI("loadMoreDoubleBall");
                throw null;
            default:
                return;
        }
    }
}
