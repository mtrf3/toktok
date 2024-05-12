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

/* renamed from: X.HNk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43968HNk extends AbstractC43973HNp {
    public final EnumC45530Htu LJLJLLL;
    public int LJLL;

    @Override // X.AbstractC43973HNp
    public final int LJZI() {
        return -1;
    }

    @Override // X.AbstractC43973HNp
    public final void LLIIIJ(MyMediaModel myMediaModel) {
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

    public final void LLIIIZ() {
        int i = this.LJLL;
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        notifyItemChanged(this.LJLL);
    }

    @Override // X.AbstractC43973HNp
    public final CutSameVideoImageExtraData LLD() {
        int LJZL = LJZL();
        if (LJZL < 0 || LJZL >= this.LJLILLLLZI.size()) {
            return null;
        }
        return (CutSameVideoImageExtraData) ListProtector.get(this.LJLILLLLZI, LJZL);
    }

    public C43968HNk(EnumC45530Htu mode) {
        o.LJIIIZ(mode, "mode");
        this.LJLJLLL = mode;
        this.LJLL = -1;
    }

    @Override // X.AbstractC43973HNp
    public final void LJLLLLLL(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        int LJZL = LJZL();
        if (LJZL < 0 || LJZL >= getItemCount()) {
            return;
        }
        ListProtector.remove(this.LJLIL, LJZL);
        ListProtector.add(this.LJLIL, LJZL, mediaModel);
        notifyItemChanged(LJZL);
        this.LJLL = LJZL();
        LLIIIZ();
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
                    int LJZL = LJZL();
                    if (LJZL == -1) {
                        this.LJLL = i;
                    } else if (LJZL >= i) {
                        LLIIIZ();
                        this.LJLL = i;
                    }
                    this.LJLIL.remove(myMediaModel);
                    ArrayList<MyMediaModel> arrayList = this.LJLIL;
                    MyMediaModel myMediaModel2 = new MyMediaModel(String.valueOf(System.currentTimeMillis()));
                    myMediaModel2.fileLocalUriPath = "";
                    myMediaModel2.thumbnail = "";
                    myMediaModel2.duration = 0L;
                    myMediaModel2.type = 4;
                    ListProtector.add(arrayList, i, myMediaModel2);
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC43973HNp
    public final void LLFZ(ArrayList<CutSameVideoImageExtraData> arrayList) {
        if (C77413UZt.LJIILL(arrayList)) {
            return;
        }
        o.LJI(arrayList);
        this.LJLILLLLZI = arrayList;
    }

    @Override // X.AbstractC43973HNp
    public final void LLIFFJFJJ(List<MyMediaModel> list) {
        o.LJIIIZ(list, "list");
        super.LLIFFJFJJ(list);
        this.LJLL = LJZL();
        LLIIIZ();
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
                ArrayList<MyMediaModel> arrayList = this.LJLIL;
                MyMediaModel myMediaModel = new MyMediaModel(String.valueOf(System.currentTimeMillis()));
                myMediaModel.fileLocalUriPath = "";
                myMediaModel.thumbnail = "";
                myMediaModel.duration = 0L;
                myMediaModel.type = 4;
                arrayList.add(myMediaModel);
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
        C43970HNm c43970HNm = (C43970HNm) viewHolder;
        MyMediaModel myMediaModel = (MyMediaModel) ListProtector.get(this.LJLIL, i);
        c43970HNm.L(myMediaModel, c43970HNm, i);
        int i3 = 8;
        c43970HNm.LJLLLL.setVisibility(8);
        c43970HNm.LJLJJLL.setVisibility(0);
        c43970HNm.LJLJJLL.setShadowLayer(0.0f, 0.0f, 0.0f, R.color.yi);
        c43970HNm.LJZI.getClass();
        if (AbstractC43973HNp.LLFFF(myMediaModel)) {
            c43970HNm.LJLJLJ.setVisibility(8);
            TuxTextView tuxTextView = c43970HNm.LJLJJLL;
            if (c43970HNm.LJZI.LJLJLLL == EnumC45530Htu.LIGHT) {
                i2 = R.attr.gp;
            } else {
                i2 = R.attr.dm;
            }
            tuxTextView.setTextColorRes(i2);
            View view = c43970HNm.LJLL;
            if (i == c43970HNm.LJZI.LJLL) {
                i3 = 0;
            }
            view.setVisibility(i3);
        } else {
            c43970HNm.LJLJLJ.setVisibility(0);
            c43970HNm.LJLL.setVisibility(8);
            c43970HNm.LJLJJLL.setTextColorRes(R.attr.dk);
            c43970HNm.LJLLLL.setVisibility(0);
        }
        C43968HNk c43968HNk = c43970HNm.LJZI;
        if (C77413UZt.LJIILL(c43968HNk.LJLILLLLZI) || i < 0 || i >= c43968HNk.LJLILLLLZI.size()) {
            j = 0;
        } else {
            j = ((CutSameVideoImageExtraData) ListProtector.get(c43968HNk.LJLILLLLZI, i)).extraDuration;
        }
        TuxTextView tuxTextView2 = c43970HNm.LJLJJLL;
        tuxTextView2.setText(tuxTextView2.getContext().getResources().getString(R.string.ijp, Float.valueOf((((float) j) * 1.0f) / 1000.0f)));
    }

    @Override // X.AbstractC43973HNp, X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C43970HNm c43970HNm = new C43970HNm(this, viewGroup);
        C0AX.LIZ(viewGroup, c43970HNm.itemView, R.id.lj7);
        View view = c43970HNm.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c43970HNm.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C43970HNm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c43970HNm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c43970HNm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C43970HNm.class.getName();
        return c43970HNm;
    }
}
