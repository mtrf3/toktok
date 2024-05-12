package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HNj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43967HNj extends AbstractC43973HNp {
    public final EnumC45530Htu LJLJLLL;
    public int LJLL;

    @Override // X.AbstractC43973HNp
    public final float LL() {
        return 6.0f;
    }

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

    public C43967HNj(EnumC45530Htu mode) {
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
        int i3 = this.LJLL + 1;
        int itemCount = getItemCount();
        while (true) {
            if (i3 < itemCount) {
                if (AbstractC43973HNp.LLFFF((MyMediaModel) ListProtector.get(this.LJLIL, i3))) {
                    break;
                } else {
                    i3++;
                }
            } else {
                int i4 = this.LJLL;
                i3 = 0;
                while (true) {
                    if (i3 < i4) {
                        if (AbstractC43973HNp.LLFFF((MyMediaModel) ListProtector.get(this.LJLIL, i3))) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
            }
        }
        this.LJLL = i3;
        notifyItemChanged(i2);
        int i5 = this.LJLL;
        if (i5 < 0 || i5 >= getItemCount()) {
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
    public final V8L LLFF(C43976HNs holder) {
        int i;
        o.LJIIIZ(holder, "holder");
        V8L v8l = new V8L();
        Integer LIZIZ = C19N.LIZIZ(holder.itemView, "holder.itemView.context", R.attr.d1);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = -16777216;
        }
        v8l.LJI(i);
        v8l.LJFF(C32151Nz.LJIIZILJ(6));
        return v8l;
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
                String str = ((MediaModel) ListProtector.get(this.LJLIL, i)).id;
                str.toString();
                String str2 = myMediaModel.id;
                str2.toString();
                if (TextUtils.equals(str, str2)) {
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

    public final long LLIIJI(int i) {
        if (C77413UZt.LJIILL(this.LJLILLLLZI) || i < 0 || i >= this.LJLILLLLZI.size()) {
            return 0L;
        }
        return ((CutSameVideoImageExtraData) ListProtector.get(this.LJLILLLLZI, i)).extraDuration;
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
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                this.LJLIL.add(LLIIIZ());
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i2 >= 0 && i2 < i) {
            this.LJLL = i2;
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L31;
     */
    @Override // X.AbstractC43973HNp, X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43967HNj.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC43973HNp, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C43972HNo c43972HNo = new C43972HNo(this, viewGroup);
        C0AX.LIZ(viewGroup, c43972HNo.itemView, R.id.lj7);
        View view = c43972HNo.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c43972HNo.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C43972HNo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c43972HNo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c43972HNo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C43972HNo.class.getName();
        return c43972HNo;
    }
}
