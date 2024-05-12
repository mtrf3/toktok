package com.ss.android.ugc.aweme.comment.commentlist.adapter;

import X.AnonymousClass742;
import X.C0RN;
import X.C16880lQ;
import X.C1797073m;
import X.C1798173x;
import X.C28289B8j;
import X.C47261Igj;
import X.C73W;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentPreCreateViewHolderManager {
    public final AnonymousClass742 LIZ;
    public final ViewGroup LIZIZ;
    public int LIZJ;
    public final Map<Integer, List<RecyclerView.ViewHolder>> LIZLLL;

    /* loaded from: classes4.dex */
    public final class PreCreateViewHolderLegoTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "CommentPreCreateViewHolderManager$PreCreateViewHolderLegoTask";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BACKGROUND;
        }

        public PreCreateViewHolderLegoTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            RecyclerView.ViewHolder LJLLLLLL;
            CommentPreCreateViewHolderManager.this.LIZ.getClass();
            int[] iArr = {1, 2};
            int i = 0;
            do {
                int i2 = iArr[i];
                CommentPreCreateViewHolderManager commentPreCreateViewHolderManager = CommentPreCreateViewHolderManager.this;
                int i3 = commentPreCreateViewHolderManager.LIZJ;
                for (int i4 = 0; i4 < i3; i4++) {
                    AnonymousClass742 anonymousClass742 = commentPreCreateViewHolderManager.LIZ;
                    ViewGroup viewGroup = commentPreCreateViewHolderManager.LIZIZ;
                    C73W c73w = (C73W) anonymousClass742;
                    if (i2 != 2) {
                        if (i2 != 222) {
                            if (i2 != 223) {
                                LJLLLLLL = c73w.LJLZ(viewGroup);
                            } else {
                                c73w.getClass();
                                LJLLLLLL = new C1798173x(C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.q4, viewGroup, false), c73w.LLFF, c73w.LJLIL);
                            }
                        } else {
                            c73w.getClass();
                            LJLLLLLL = new C1797073m(C28289B8j.LIZ(viewGroup, R.layout.qc, viewGroup, false));
                        }
                    } else {
                        LJLLLLLL = c73w.LJLLLLLL(viewGroup);
                    }
                    synchronized (commentPreCreateViewHolderManager.LIZLLL) {
                        if (((LinkedHashMap) commentPreCreateViewHolderManager.LIZLLL).get(Integer.valueOf(i2)) == null) {
                            commentPreCreateViewHolderManager.LIZLLL.put(Integer.valueOf(i2), C47261Igj.LJJIJIL(LJLLLLLL));
                        } else {
                            List list = (List) ((LinkedHashMap) commentPreCreateViewHolderManager.LIZLLL).get(Integer.valueOf(i2));
                            if (list != null) {
                                list.add(LJLLLLLL);
                            }
                        }
                    }
                }
                i++;
            } while (i < 2);
        }
    }

    public final RecyclerView.ViewHolder LIZ(int i) {
        RecyclerView.ViewHolder viewHolder;
        synchronized (this.LIZLLL) {
            List list = (List) ((LinkedHashMap) this.LIZLLL).get(Integer.valueOf(i));
            viewHolder = null;
            if (list != null && list.size() > 0) {
                viewHolder = (RecyclerView.ViewHolder) list.get(0);
                list.remove(viewHolder);
            }
        }
        return viewHolder;
    }

    public CommentPreCreateViewHolderManager(AnonymousClass742 creator, ViewGroup parent) {
        o.LJIIIZ(creator, "creator");
        o.LJIIIZ(parent, "parent");
        this.LIZ = creator;
        this.LIZIZ = parent;
        this.LIZJ = 5;
        this.LIZLLL = new LinkedHashMap();
    }
}
