package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HNl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43969HNl extends AbstractC43973HNp {
    public final EnumC45530Htu LJLJLLL;
    public int LJLL;

    public static final MyMediaModel LLIIIZ() {
        MyMediaModel myMediaModel = new MyMediaModel(AnonymousClass629.LIZ("randomUUID().toString()"));
        myMediaModel.fileLocalUriPath = "";
        myMediaModel.thumbnail = "";
        myMediaModel.duration = 0L;
        myMediaModel.type = 4;
        return myMediaModel;
    }

    @Override // X.AbstractC43973HNp
    public final int LJZL() {
        Iterator<MyMediaModel> it = this.LJLIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            MyMediaModel next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (AbstractC43973HNp.LLFFF(next)) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    @Override // X.AbstractC43973HNp
    public final int LLFII() {
        if (this.LJLJLLL == EnumC45530Htu.LIGHT) {
            return R.drawable.t2;
        }
        return R.drawable.t1;
    }

    @Override // X.AbstractC43973HNp
    public final int LJZI() {
        int itemCount = getItemCount();
        int i = this.LJLL;
        if (i >= 0 && i < itemCount) {
            return i;
        }
        return LJZL();
    }

    @Override // X.AbstractC43973HNp
    public final CutSameVideoImageExtraData LLD() {
        int LJZL = LJZL();
        if (LJZL < 0 || LJZL >= this.LJLILLLLZI.size()) {
            return null;
        }
        return (CutSameVideoImageExtraData) ListProtector.get(this.LJLILLLLZI, LJZL);
    }

    public C43969HNl(EnumC45530Htu mode) {
        o.LJIIIZ(mode, "mode");
        this.LJLJLLL = mode;
        this.LJLL = -1;
    }

    @Override // X.AbstractC43973HNp
    public final void LJLLLLLL(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        int i = this.LJLL;
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        int i2 = this.LJLL;
        ListProtector.remove(this.LJLIL, i2);
        ListProtector.add(this.LJLIL, i2, mediaModel);
        this.LJLL = LJZL();
        notifyItemChanged(i2);
        int i3 = this.LJLL;
        if (i3 < 0 || i3 >= getItemCount()) {
            return;
        }
        notifyItemChanged(this.LJLL);
    }

    @Override // X.AbstractC43973HNp
    public final void LJZ(MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return;
        }
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            if (o.LJ(((MediaModel) ListProtector.get(this.LJLIL, i)).fileLocalUriPath, myMediaModel.fileLocalUriPath) && TextUtils.equals(((MyMediaModel) ListProtector.get(this.LJLIL, i)).LJII(), myMediaModel.LJII())) {
                if (i >= 0) {
                    int i2 = this.LJLL;
                    this.LJLL = i;
                    this.LJLIL.remove(myMediaModel);
                    ListProtector.add(this.LJLIL, i, LLIIIZ());
                    notifyItemChanged(i);
                    if (i2 >= 0 && i2 < getItemCount()) {
                        notifyItemChanged(i2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC43973HNp
    public final void LLFZ(ArrayList<CutSameVideoImageExtraData> arrayList) {
        if (arrayList != null) {
            this.LJLILLLLZI = arrayList;
        }
    }

    @Override // X.AbstractC43973HNp
    public final void LLIFFJFJJ(List<MyMediaModel> list) {
        o.LJIIIZ(list, "list");
        super.LLIFFJFJJ(list);
        int LJZL = LJZL();
        this.LJLL = LJZL;
        if (LJZL < 0 || LJZL >= getItemCount()) {
            return;
        }
        notifyItemChanged(this.LJLL);
    }

    @Override // X.AbstractC43973HNp
    public final void LLIIIJ(MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return;
        }
        int size = this.LJLIL.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (TextUtils.equals(((MediaModel) ListProtector.get(this.LJLIL, i)).id, myMediaModel.id)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = this.LJLL;
        if (i2 == i) {
            return;
        }
        if (i2 < 0 || i2 >= size) {
            i2 = -1;
        }
        if (i != -1) {
            this.LJLL = i;
            notifyItemChanged(i);
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
        }
    }

    @Override // X.AbstractC43973HNp
    public final void LJL(RecyclerView.ViewHolder sourceHolder, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(sourceHolder, "sourceHolder");
        int adapterPosition = sourceHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder.getAdapterPosition();
        if (adapterPosition < this.LJLIL.size() && adapterPosition2 < this.LJLIL.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            Object remove = ListProtector.remove(this.LJLIL, adapterPosition);
            o.LJIIIIZZ(remove, "mediaModelList.removeAt(from)");
            ListProtector.add(this.LJLIL, adapterPosition2, remove);
        }
    }

    @Override // X.AbstractC43973HNp
    public final void LJLZ(int i, int i2) {
        int i3 = 1;
        if (1 <= i) {
            while (true) {
                this.LJLIL.add(LLIIIZ());
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.LJLL = 0;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC43973HNp, X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        int i2;
        o.LJIIIZ(viewHolder, "viewHolder");
        C43971HNn c43971HNn = (C43971HNn) viewHolder;
        MyMediaModel myMediaModel = (MyMediaModel) ListProtector.get(this.LJLIL, i);
        c43971HNn.L(myMediaModel, c43971HNn, i);
        int i3 = 8;
        c43971HNn.LJLLLL.setVisibility(8);
        c43971HNn.LJLJJLL.setVisibility(0);
        c43971HNn.LJLJJLL.setShadowLayer(0.0f, 0.0f, 0.0f, R.color.yi);
        c43971HNn.LJZI.getClass();
        if (AbstractC43973HNp.LLFFF(myMediaModel)) {
            c43971HNn.LJLJLJ.setVisibility(8);
            TuxTextView tuxTextView = c43971HNn.LJLJJLL;
            if (c43971HNn.LJZI.LJLJLLL == EnumC45530Htu.LIGHT) {
                i2 = R.attr.gp;
            } else {
                i2 = R.attr.dm;
            }
            tuxTextView.setTextColorRes(i2);
            View view = c43971HNn.LJLL;
            if (i == c43971HNn.LJZI.LJLL) {
                i3 = 0;
            }
            view.setVisibility(i3);
        } else {
            c43971HNn.LJLJLJ.setVisibility(0);
            c43971HNn.LJLL.setVisibility(8);
            c43971HNn.LJLJJLL.setTextColorRes(R.attr.dk);
            c43971HNn.LJLLLL.setVisibility(0);
        }
        C43969HNl c43969HNl = c43971HNn.LJZI;
        if (C77413UZt.LJIILL(c43969HNl.LJLILLLLZI) || i < 0 || i >= c43969HNl.LJLILLLLZI.size()) {
            j = 0;
        } else {
            j = ((CutSameVideoImageExtraData) ListProtector.get(c43969HNl.LJLILLLLZI, i)).extraDuration;
        }
        TuxTextView tuxTextView2 = c43971HNn.LJLJJLL;
        tuxTextView2.setText(tuxTextView2.getContext().getResources().getString(R.string.ijp, Float.valueOf((((float) j) * 1.0f) / 1000.0f)));
    }

    @Override // X.AbstractC43973HNp, X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C43971HNn c43971HNn = new C43971HNn(this, viewGroup);
        C0AX.LIZ(viewGroup, c43971HNn.itemView, R.id.lj7);
        View view = c43971HNn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c43971HNn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C43971HNn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c43971HNn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c43971HNn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C43971HNn.class.getName();
        return c43971HNn;
    }
}
