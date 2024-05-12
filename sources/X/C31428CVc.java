package X;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CVc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31428CVc<T> implements InterfaceC64592gB {
    public final /* synthetic */ C31443CVr LJLIL;

    public C31428CVc(C31443CVr c31443CVr) {
        this.LJLIL = c31443CVr;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        int size;
        CRD crd;
        int size2;
        List<? extends CQO<? extends CR6>> list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        CWN floatMsgViewCallback2 = this.LJLIL.getFloatMsgViewCallback2();
        if (floatMsgViewCallback2 != null) {
            floatMsgViewCallback2.LIZJ(list);
        }
        if (!this.LJLIL.LJLLL.LJIIIIZZ.isEmpty()) {
            if (list instanceof ArrayList) {
                Iterator<OSZ<ChatMessage, ChatMessage>> it = this.LJLIL.LJLLL.LJIIIIZZ.iterator();
                while (it.hasNext()) {
                    OSZ<ChatMessage, ChatMessage> next = it.next();
                    C31443CVr c31443CVr = this.LJLIL;
                    ChatMessage first = next.getFirst();
                    ChatMessage second = next.getSecond();
                    c31443CVr.getClass();
                    C31443CVr.LJIIIIZZ((ArrayList) list, first, second);
                }
            }
            this.LJLIL.LJLLL.LJIIIIZZ.clear();
        }
        ArrayList arrayList = new ArrayList();
        int size3 = list.size();
        for (int i = 0; i < size3; i++) {
            CQO cqo = (CQO) ORZ.LJLLLLLL(i, list);
            if (cqo != null) {
                C31443CVr c31443CVr2 = this.LJLIL;
                C31322CRa messageBehaviorProvider = c31443CVr2.getMessageBehaviorProvider();
                Class<?> cls = cqo.LJIJJLI.getClass();
                messageBehaviorProvider.getClass();
                AbstractC31313CQr abstractC31313CQr = (AbstractC31313CQr) ((HashMap) C31322CRa.LIZIZ).get(cls);
                if (abstractC31313CQr == null) {
                    abstractC31313CQr = C31333CRl.LIZJ;
                }
                o.LJII(abstractC31313CQr, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.impl.presenter.messageextension.MessageBehavior<com.bytedance.android.livesdk.message.model.BaseLiveMessage>");
                if (abstractC31313CQr.LJFF(cqo.LJLIIL(), cqo.LJIJJLI)) {
                    C31429CVd c31429CVd = c31443CVr2.LJLLL;
                    c31429CVd.getClass();
                    if (((ArrayDeque) c31429CVd.LJIILIIL).size() < c31429CVd.LJIIL) {
                        ((ArrayDeque) c31429CVd.LJIILIIL).add(cqo);
                        cqo.LJIILIIL.LIZ = true;
                        C31377CTd c31377CTd = cqo.LJIILJJIL;
                        c31377CTd.LIZ = true;
                        c31377CTd.LIZIZ = SystemClock.uptimeMillis();
                    } else {
                        cqo.dispose();
                    }
                } else {
                    arrayList.add(cqo);
                }
            }
        }
        C31443CVr c31443CVr3 = this.LJLIL;
        C31453CWb c31453CWb = c31443CVr3.LJZL;
        if (c31453CWb == null || c31453CWb.LJII == EnumC31433CVh.NORMAL) {
            C31429CVd c31429CVd2 = c31443CVr3.LJLLL;
            c31429CVd2.getClass();
            int size4 = c31429CVd2.LJ.size();
            int size5 = arrayList.size() + c31429CVd2.LJ.size();
            if (size5 > c31429CVd2.LIZJ) {
                int i2 = size5 - c31429CVd2.LIZLLL;
                if (i2 <= c31429CVd2.LJ.size()) {
                    size = i2;
                } else {
                    size = c31429CVd2.LJ.size();
                    List subList = arrayList.subList(0, i2 - size);
                    o.LJII(subList, "null cannot be cast to non-null type java.util.ArrayList<com.bytedance.android.live.publicscreen.api.model.PublicScreenMessageModel<out com.bytedance.android.livesdk.message.model.BaseLiveMessage>>{ kotlin.collections.TypeAliasesKt.ArrayList<com.bytedance.android.live.publicscreen.api.model.PublicScreenMessageModel<out com.bytedance.android.livesdk.message.model.BaseLiveMessage>> }");
                    ((ArrayList) subList).clear();
                }
                ArrayList arrayList2 = new ArrayList(c31429CVd2.LJ.subList(0, size));
                int size6 = arrayList2.size();
                for (int i3 = 0; i3 < size6; i3++) {
                    C65777Prh.LIZ(c31429CVd2.LJ).remove(ListProtector.get(arrayList2, i3));
                }
                int size7 = size4 - c31429CVd2.LJ.size();
                if (size7 > 0) {
                    c31429CVd2.LIZIZ.invoke(0, Integer.valueOf(size7));
                }
                StringBuilder LIZJ = C06460Ne.LIZJ("shoulddelete=", i2, "desiredCropCount=", size, "realCropCount=");
                b1.LJ(LIZJ, size7, LIZJ, "LiveGameMsgPresenter2");
            }
        }
        C31443CVr c31443CVr4 = this.LJLIL;
        c31443CVr4.getClass();
        try {
            int size8 = c31443CVr4.LJLLL.LJ.size();
            c31443CVr4.LJLLL.LJ.addAll(size8, arrayList);
            C31429CVd c31429CVd3 = c31443CVr4.LJLLL;
            if (c31429CVd3.LJ.isEmpty()) {
                crd = null;
            } else {
                crd = (CRD) ORZ.LLFF(c31443CVr4.LJLLL.LJ);
            }
            c31429CVd3.LJFF = crd;
            try {
                c31443CVr4.LJIIIZ();
                C31435CVj c31435CVj = c31443CVr4.LJLIL;
                if (c31435CVj != null) {
                    c31435CVj.notifyItemRangeInserted(size8, arrayList.size());
                }
                C31453CWb c31453CWb2 = c31443CVr4.LJZL;
                if (c31453CWb2 != null) {
                    c31453CWb2.LIZ(arrayList.size());
                }
            } catch (Exception unused) {
                ((C31255COl) c31443CVr4.LIZ(R.id.isn)).getRecycledViewPool().clear();
                try {
                    C31435CVj c31435CVj2 = c31443CVr4.LJLIL;
                    if (c31435CVj2 != null) {
                        c31435CVj2.notifyDataSetChanged();
                    }
                } catch (Throwable unused2) {
                }
            }
            C31429CVd c31429CVd4 = c31443CVr4.LJLLL;
            int i4 = c31429CVd4.LJI;
            c31429CVd4.LJI = c31429CVd4.LJ.size();
            if (i4 < c31443CVr4.LJLLL.LJI) {
                ((C31255COl) c31443CVr4.LIZ(R.id.isn)).getMeasuredHeight();
                C87277YNd.LJIIJJI(154);
            }
            if (C79004UzY.LJJIFFI(c31443CVr4.LJLLL.LJ) || (size2 = c31443CVr4.LJLLL.LJ.size()) <= 0 || ((C31255COl) c31443CVr4.LIZ(R.id.isn)).canScrollVertically(1)) {
                return;
            }
            ((C31255COl) c31443CVr4.LIZ(R.id.isn)).LJLI(size2 - 1);
        } catch (Throwable th) {
            C0NB.LIZLLL(th.getMessage());
            ((RecyclerView) c31443CVr4.LIZ(R.id.isn)).getRecycledViewPool().clear();
            try {
                c31443CVr4.LJIIIZ();
            } catch (Throwable unused3) {
            }
        }
    }
}
