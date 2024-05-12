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
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HNp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43973HNp extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final ArrayList<MyMediaModel> LJLIL;
    public ArrayList<CutSameVideoImageExtraData> LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public InterfaceC43977HNt LJLJJLL;
    public final Integer LJLJL;
    public InterfaceC65784Pro<Boolean> LJLJLJ;

    public abstract void LJLZ(int i, int i2);

    public abstract int LJZI();

    public abstract int LJZL();

    public abstract CutSameVideoImageExtraData LLD();

    public int LLFII() {
        return R.drawable.zo;
    }

    public abstract void LLFZ(ArrayList<CutSameVideoImageExtraData> arrayList);

    public Integer LLII(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        return null;
    }

    public void LLIIII(int i) {
    }

    public abstract void LLIIIJ(MyMediaModel myMediaModel);

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public AbstractC43973HNp() {
        this.LJLIL = new ArrayList<>();
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJI = -1;
        this.LJLJJI = -1;
    }

    public float LL() {
        if (C58B.LIZ()) {
            return 6.0f;
        }
        return 2.0f;
    }

    public AbstractC43973HNp(Integer num) {
        this();
        this.LJLJL = num;
    }

    public static boolean LLFFF(MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return true;
        }
        if (TextUtils.isEmpty(myMediaModel.fileLocalUriPath) && TextUtils.isEmpty(myMediaModel.thumbnail)) {
            return true;
        }
        return false;
    }

    public void LJLLLLLL(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        notifyItemInserted(getItemCount());
        this.LJLIL.add(mediaModel);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoImageMixedBaseAdapter addMediaData originIndex ");
        LIZ.append(mediaModel.originIndex);
        LIZ.append(" selectIndex ");
        LIZ.append(mediaModel.selectIndex);
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    public void LJZ(MyMediaModel myMediaModel) {
        int LLF;
        if (myMediaModel == null || (LLF = LLF(myMediaModel)) == -1) {
            return;
        }
        notifyItemRemoved(LLF);
        this.LJLIL.remove(myMediaModel);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoImageMixedBaseAdapter deleteMediaData originIndex ");
        LIZ.append(myMediaModel.originIndex);
        LIZ.append(" selectIndex ");
        LIZ.append(myMediaModel.selectIndex);
        LIZ.append(' ');
        LIZ.append(C47261Igj.LJJII());
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    public final int LLF(MyMediaModel myMediaModel) {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            if (this.LJLJJL) {
                if (o.LJ(((MediaModel) ListProtector.get(this.LJLIL, i)).fileLocalUriPath, myMediaModel.fileLocalUriPath) && TextUtils.equals(((MyMediaModel) ListProtector.get(this.LJLIL, i)).LJII(), myMediaModel.LJII())) {
                    return i;
                }
            } else {
                if (o.LJ(((MediaModel) ListProtector.get(this.LJLIL, i)).fileLocalUriPath, myMediaModel.fileLocalUriPath)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public V8L LLFF(C43976HNs holder) {
        int i;
        o.LJIIIZ(holder, "holder");
        V8L v8l = new V8L();
        Integer LIZIZ = C19N.LIZIZ(holder.itemView, "holder.itemView.context", R.attr.cl);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = -1;
        }
        v8l.LJI(i);
        v8l.LJFF(C32151Nz.LJIIZILJ(Float.valueOf(LL())));
        return v8l;
    }

    public void LLIFFJFJJ(List<MyMediaModel> list) {
        o.LJIIIZ(list, "list");
        this.LJLIL.clear();
        ORS.LJJLIIIJILLIZJL(list, this.LJLIL);
        notifyDataSetChanged();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoImageMixedBaseAdapter setMediaList size ");
        LIZ.append(list.size());
        LIZ.append(' ');
        LIZ.append(C47261Igj.LJJII());
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    public final void LLIIIL(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        int LLF = LLF(mediaModel);
        if (LLF == -1) {
            return;
        }
        Object obj = ListProtector.get(this.LJLIL, LLF);
        o.LJIIIIZZ(obj, "mediaModelList[mediaIndex]");
        MediaModel mediaModel2 = (MediaModel) obj;
        mediaModel2.duration = mediaModel.duration;
        mediaModel2.libraryState = mediaModel.libraryState;
        notifyItemChanged(LLF, new Object());
    }

    public void LJL(RecyclerView.ViewHolder sourceHolder, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(sourceHolder, "sourceHolder");
        LLIIIILZ(sourceHolder.getAdapterPosition(), viewHolder.getAdapterPosition());
    }

    public final void LLIIIILZ(int i, int i2) {
        if (i >= 0 && i < this.LJLIL.size() && i2 >= 0 && i2 < this.LJLIL.size()) {
            notifyItemMoved(i, i2);
            Object remove = ListProtector.remove(this.LJLIL, i);
            o.LJIIIIZZ(remove, "mediaModelList.removeAt(from)");
            ListProtector.add(this.LJLIL, i2, remove);
        }
    }

    @Override // X.AbstractC029409q
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        C43976HNs c43976HNs = (C43976HNs) viewHolder;
        c43976HNs.L((MyMediaModel) ListProtector.get(this.LJLIL, i), c43976HNs, i);
    }

    @Override // X.AbstractC029409q
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C43976HNs c43976HNs = new C43976HNs(this, viewGroup, this.LJLJL);
        C0AX.LIZ(viewGroup, c43976HNs.itemView, R.id.lj7);
        View view = c43976HNs.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c43976HNs.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C43976HNs.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c43976HNs.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c43976HNs.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C43976HNs.class.getName();
        return c43976HNs;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
        } else {
            C43976HNs c43976HNs = (C43976HNs) holder;
            c43976HNs.Q((MyMediaModel) ListProtector.get(this.LJLIL, i), c43976HNs, i);
        }
    }
}
