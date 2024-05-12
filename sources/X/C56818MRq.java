package X;

import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeData;
import com.ss.android.ugc.aweme.notification.NoticeCardFragment;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MRq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56818MRq extends C8HS<SystemNoticeData> {
    public final Fragment LJLIL;
    public final MOH LJLILLLLZI;
    public RecyclerView LJLJI;
    public final C62822Ol8 LJLJJI;
    public MusNotice LJLJJL;
    public ViewOnClickListenerC56819MRr LJLJJLL;

    public final void LJLZ(String str) {
        MusNotice musNotice;
        ViewOnClickListenerC56819MRr viewOnClickListenerC56819MRr = this.LJLJJLL;
        if (viewOnClickListenerC56819MRr == null || (musNotice = this.LJLJJL) == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        viewOnClickListenerC56819MRr.N(c188727au, musNotice);
        c188727au.LJI("type", str);
        c188727au.LIZLLL(musNotice.channelCategory, "category_type");
        FMX.LJIIL("message_manage_click", c188727au.LIZ);
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        SystemNoticeData systemNoticeData;
        List<SystemNoticeData> data = getData();
        if (data == null || (systemNoticeData = (SystemNoticeData) ListProtector.get(data, i)) == null) {
            return -1;
        }
        if (systemNoticeData.getChannelList() != null) {
            return MDO.CHANNEL.ordinal();
        }
        return MDO.NOTICE.ordinal();
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJI = recyclerView;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ((C73318Sq2) this.LJLJJI.getValue()).LIZLLL();
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56819MRr viewOnClickListenerC56819MRr;
        MusNotice notice;
        String str;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56819MRr) && (viewOnClickListenerC56819MRr = (ViewOnClickListenerC56819MRr) holder) != null) {
            MOH moh = viewOnClickListenerC56819MRr.LJLILLLLZI;
            SystemNoticeData systemNoticeData = viewOnClickListenerC56819MRr.LJLJJL;
            AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(viewOnClickListenerC56819MRr, 467);
            moh.getClass();
            if (systemNoticeData == null || (notice = systemNoticeData.getNotice()) == null || (str = notice.nid) == null || str.length() == 0 || ((CopyOnWriteArraySet) moh.LJLLILLLL.getValue()).contains(notice.nid)) {
                return;
            }
            ((CopyOnWriteArraySet) moh.LJLLILLLL.getValue()).add(notice.nid);
            aqS159S0100000_9.invoke();
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        boolean z = holder instanceof ViewOnClickListenerC56819MRr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56818MRq(NoticeCardFragment fragment, MOH model) {
        super(false, 1, null);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(model, "model");
        this.LJLIL = fragment;
        this.LJLILLLLZI = model;
        this.LJLJJI = C221108m2.LIZIZ(C56826MRy.LJLIL);
    }

    public final void LJLLLLLL(BaseNotice baseNotice, int i) {
        String str;
        List<SystemNoticeData> data = getData();
        if (data != null) {
            ListProtector.remove(data, i);
        }
        notifyItemRemoved(i);
        if (baseNotice == null || (str = baseNotice.nid) == null) {
            str = "";
        }
        C2U8.LIZ(new MR4(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x02f1, code lost:
    
        if (r0 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ac, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L71;
     */
    @Override // X.C4II
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r17, int r18) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56818MRq.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        EnumC56823MRv enumC56823MRv;
        o.LJIIIZ(parent, "parent");
        if (i == MDO.CHANNEL.ordinal()) {
            return new C8I4(new SYL(parent.getContext(), null));
        }
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        MOH moh = this.LJLILLLLZI;
        moh.getClass();
        if (C53364Kwy.LIZ() && (C53363Kwx.LIZ() == 1 || C53363Kwx.LIZ() == 2)) {
            if (moh.LJLJJLL) {
                enumC56823MRv = EnumC56823MRv.SECOND_PAGE_BIG_CARD;
            } else {
                enumC56823MRv = EnumC56823MRv.FIRST_PAGE_BIG_CARD;
            }
        } else if (moh.LJLJJLL) {
            enumC56823MRv = EnumC56823MRv.SECOND_PAGE_SMALL_CARD;
        } else {
            enumC56823MRv = EnumC56823MRv.FIRST_PAGE_SMALL_CARD;
        }
        ViewOnClickListenerC56819MRr viewOnClickListenerC56819MRr = new ViewOnClickListenerC56819MRr(this.LJLIL, this.LJLILLLLZI, new C81367VwZ(context, enumC56823MRv));
        viewOnClickListenerC56819MRr.LJLJI.setDeleteListener(new ACListenerS44S0200000_9(viewOnClickListenerC56819MRr, new MDL(this), 14));
        viewOnClickListenerC56819MRr.LLI = new MDM(this);
        return viewOnClickListenerC56819MRr;
    }
}
