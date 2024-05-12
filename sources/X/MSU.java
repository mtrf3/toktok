package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.assem.CreatorNoticeResultAssem;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSU extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final Fragment LJLIL;
    public final CreatorNoticeResultVM LJLILLLLZI;
    public final InterfaceC56828MSa LJLJI;
    public final C5H3 LJLJJI;
    public MSP LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public final MUZ LJLLLLLL() {
        return (MUZ) this.LJLJJLL.getValue();
    }

    public final List<MusNotice> getData() {
        return (List) this.LJLJJI.getValue();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return ((MusNotice) ListProtector.get(getData(), i)).getUniqueId();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return C78966Uyw.LJJIIZ((MusNotice) ListProtector.get(getData(), i));
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        MVV mvv;
        BaseNotice baseNotice;
        int LJZ;
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onAttached();
        }
        if ((holder instanceof MVV) && (mvv = (MVV) holder) != null && (baseNotice = mvv.mMTBaseNotice) != null && NoticePerfManager.LIZ().enableLoadMorePreload && !(this.LJLILLLLZI.getState().LJLJJLL instanceof C72922tc)) {
            CreatorNoticeResultVM creatorNoticeResultVM = this.LJLILLLLZI;
            if (creatorNoticeResultVM.LJLLILLLL) {
                if ((creatorNoticeResultVM.LJLLLL && creatorNoticeResultVM.LJLLL) || (LJZ = ORZ.LJZ(baseNotice, getData())) <= 0 || getData().size() - LJZ > 10) {
                    return;
                }
                MS5.LJII(C2LM.LJLIL, new AqS175S0100000_9(this, 378));
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onDetached();
        }
    }

    public final void LJLZ(List<? extends MusNotice> newList, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(newList, "newList");
        if (getData().isEmpty() || newList.isEmpty()) {
            getData().clear();
            getData().addAll(newList);
            notifyDataSetChanged();
            interfaceC65784Pro.invoke();
            return;
        }
        MS5.LJ(new AqS69S0400000_9(ORZ.LLJI(getData()), newList, (List<? extends MusNotice>) this, (MSU) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MSU.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder msw;
        o.LJIIIZ(parent, "parent");
        if (i != 31000) {
            switch (i) {
                case 33000:
                    msw = new MSZ(MUZ.LJ(LJLLLLLL(), R.layout.bc8, parent));
                    break;
                case 33001:
                    msw = new MSX(MUZ.LJ(LJLLLLLL(), R.layout.bc8, parent), this.LJLILLLLZI);
                    break;
                default:
                    msw = LJLLLLLL().LJII(parent, i);
                    break;
            }
        } else {
            msw = new MSW(MUZ.LJ(LJLLLLLL(), R.layout.sf, parent), this.LJLILLLLZI);
        }
        C0AX.LIZ(parent, msw.itemView, R.id.lj7);
        View view = msw.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (msw.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(msw.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) msw.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(msw.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = msw.getClass().getName();
        return msw;
    }

    public MSU(Fragment fragment, CreatorNoticeResultVM vm, CreatorNoticeResultAssem creatorNoticeResultAssem) {
        o.LJIIIZ(vm, "vm");
        this.LJLIL = fragment;
        this.LJLILLLLZI = vm;
        this.LJLJI = creatorNoticeResultAssem;
        this.LJLJJI = V1B.LJZI(EAT.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 759));
    }
}
