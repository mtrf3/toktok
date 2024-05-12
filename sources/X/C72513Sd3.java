package X;

import Y.ACListenerS21S0100000_1;
import Y.AfS61S0100000_9;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sd3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72513Sd3 implements InterfaceC56810MRi, InterfaceC117044ia {
    public final C72504Scu LJLIL;
    public final NotificationChunkVM LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public final void LIZ(int i) {
        List list;
        NotificationChunkVM notificationChunkVM = this.LJLILLLLZI;
        Collection collection = (Collection) ((LiveData) notificationChunkVM.LJLLLL.getValue()).getValue();
        Integer num = null;
        if (collection != null) {
            list = ORZ.LLJILJILJ(collection);
            int i2 = i + 1;
            int i3 = 0;
            if (list != null && !list.isEmpty() && i2 >= 0 && i2 < list.size() && (ListProtector.get(list, i2) instanceof C72520SdA)) {
                Object obj = ListProtector.get(list, i2);
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.module.model.NotificationItem");
                C72520SdA c72520SdA = (C72520SdA) obj;
                C72514Sd4 c72514Sd4 = notificationChunkVM.LJLLL;
                c72514Sd4.getClass();
                c72514Sd4.LIZ.remove(c72520SdA);
                c72514Sd4.LIZIZ.remove(c72520SdA);
                MusNotice musNotice = c72520SdA.LJLILLLLZI;
                if (musNotice != null) {
                    c72514Sd4.LIZJ.remove(musNotice);
                }
                Iterator<C72523SdD> it = c72514Sd4.LIZ.iterator();
                while (it.hasNext()) {
                    it.next().LJLIL = i3;
                    i3++;
                }
                ListProtector.remove(list, i2);
                ((LiveData) notificationChunkVM.LJLLLL.getValue()).setValue(list);
                ((LiveData) notificationChunkVM.LJLLLLLL.getValue()).setValue(Boolean.TRUE);
                MusNotice notice = c72520SdA.LJLILLLLZI;
                o.LJIIIZ(notice, "notice");
                C78999UzT.LJFF(NotificationApi.LIZ().deleteNotice(notice.nid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(notice, 64), new AfS61S0100000_9(notice, 65)), (C73318Sq2) notificationChunkVM.LJLIL.getValue());
                return;
            }
        } else {
            list = null;
        }
        StringBuilder LJ = C7MY.LJ("delete invalid:", i, ", ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        LJ.append(num);
        C221018lt.LIZIZ("NotificationChunkVM", X1D.LIZIZ(LJ));
    }

    @Override // X.InterfaceC56810MRi
    public final void onItemClick(int i) {
        this.LJLIL.LJIIJ().LIZIZ();
    }

    @Override // X.InterfaceC56810MRi
    public final void onItemLongClick(int i) {
        FragmentManager supportFragmentManager;
        if (this.LJLILLLLZI.LJLLJ == EnumC72512Sd2.COLLAPSE) {
            C221018lt.LIZIZ("NotificationChunk", "Do not support delete in collapse mode");
            return;
        }
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.efd);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS99S0101000_12(this, i, 29), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZIZ(LIZIZ);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        SI5 si5 = this.LJLIL.LJLJJLL;
        Fragment fragment = si5.LJLILLLLZI;
        if (fragment == null || (supportFragmentManager = fragment.getFragmentManager()) == null) {
            supportFragmentManager = si5.LJLIL.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        }
        LIZJ.show(supportFragmentManager, "DELETE_NOTICE_ACTION_SHEET_TAG");
    }

    public C72513Sd3(C72504Scu chunk, NotificationChunkVM vm) {
        o.LJIIIZ(chunk, "chunk");
        o.LJIIIZ(vm, "vm");
        this.LJLIL = chunk;
        this.LJLILLLLZI = vm;
        this.LJLJI = C221108m2.LIZIZ(C72511Sd1.LJLIL);
        C221108m2.LIZIZ(C72510Sd0.INSTANCE);
    }

    public final void LIZIZ(String str, boolean z) {
        if (z) {
            ((List) this.LJLJI.getValue()).add(str);
        } else {
            ((List) this.LJLJI.getValue()).remove(str);
        }
        Integer value = this.LJLIL.LJIIJ().LIZ().getValue();
        int size = ((List) this.LJLJI.getValue()).size();
        if (value == null || value.intValue() != size) {
            this.LJLIL.LJIIJ().LIZ().setValue(Integer.valueOf(((List) this.LJLJI.getValue()).size()));
        }
    }
}
