package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UwM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78806UwM implements InterfaceC83500Wps {
    public final /* synthetic */ OptionCategoryPanelViewModel LIZ;

    @Override // X.InterfaceC83500Wps
    public final void LIZ() {
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZJ(C83489Wph c83489Wph) {
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZLLL() {
    }

    public C78806UwM(OptionCategoryPanelViewModel optionCategoryPanelViewModel) {
        this.LIZ = optionCategoryPanelViewModel;
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZIZ(List<String> list) {
        boolean z;
        boolean z2;
        Bitmap LJI;
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            this.LIZ.LJLJJLL.postValue(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        OptionCategoryPanelViewModel optionCategoryPanelViewModel = this.LIZ;
        C78826Uwg c78826Uwg = optionCategoryPanelViewModel.LJLJJL;
        String str = optionCategoryPanelViewModel.LJLJI;
        int LIZIZ = C7MY.LIZIZ(62);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(62));
        c78826Uwg.getClass();
        Bitmap LJI2 = C78826Uwg.LJI(LIZIZ, LJJIIZ, str);
        Iterator it = ((ArrayList) ORZ.LLIIIJ(1, C47261Igj.LJJ(list))).iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                boolean LJ = o.LJ(ListProtector.get(list, intValue), this.LIZ.LJLJI);
                if (LJ) {
                    LJI = LJI2;
                } else {
                    C78826Uwg c78826Uwg2 = this.LIZ.LJLJJL;
                    String str2 = (String) ListProtector.get(list, intValue);
                    int LIZIZ2 = C7MY.LIZIZ(62);
                    int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(62));
                    c78826Uwg2.getClass();
                    LJI = C78826Uwg.LJI(LIZIZ2, LJJIIZ2, str2);
                }
                arrayList2.add(new C78789Uw5(null, (String) ListProtector.get(list, intValue), (String) ListProtector.get(list, intValue), null, "Green Screen", null, 62, 62, 8, EnumC78125UlN.LOCAL, LJ, LJI, 41));
                if (z || LJ) {
                    z = true;
                }
            }
        }
        if (list.size() == 15) {
            EnumC78125UlN enumC78125UlN = EnumC78125UlN.LOCAL;
            if (!z && this.LIZ.LJLJI != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            ListProtector.add(arrayList2, 0, new C78789Uw5(null, "", "plus", null, "Green Screen", null, 62, 62, 8, enumC78125UlN, z2, null, 2089));
        }
        OptionCategoryPanelViewModel optionCategoryPanelViewModel2 = this.LIZ;
        String str3 = optionCategoryPanelViewModel2.LJLJI;
        if (str3 != null) {
            optionCategoryPanelViewModel2.LJLJJL.LIZIZ(new C78820Uwa("Environment", 0, "Green Screen", 0, new C78789Uw5(null, null, str3, null, null, null, 0, 0, 0, null, false, null, 4091)), null);
        }
        C78801UwH c78801UwH = new C78801UwH("Green Screen", C03660Ck.LIZ(this.LIZ.LJLJJI, R.string.s0j, "activity.resources.getSt….string.tab_green_screen)"), "", new ArrayList(), arrayList2);
        C78826Uwg c78826Uwg3 = this.LIZ.LJLJJL;
        c78826Uwg3.getClass();
        ((ArrayList) c78826Uwg3.LJFF).add(c78801UwH);
        arrayList.add(c78801UwH);
        this.LIZ.LJLJJLL.postValue(arrayList);
    }
}
