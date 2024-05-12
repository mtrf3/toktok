package X;

import android.os.Bundle;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;

/* renamed from: X.7iA */
/* loaded from: classes4.dex */
public final class C193227iA {
    public static /* synthetic */ void LIZJ(FragmentManager fragmentManager, String str, String str2, InterfaceC193237iB interfaceC193237iB) {
        LIZIZ(fragmentManager, str, null, str2, true, true, interfaceC193237iB);
    }

    public static InputNameSheetFragment LIZ(String str, String str2, String str3, boolean z, boolean z2, InterfaceC193237iB interfaceC193237iB) {
        InputNameSheetFragment inputNameSheetFragment = new InputNameSheetFragment();
        Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("enablePrivacySetting", z2, "title", str);
        m.putString("btnName", str3);
        m.putBoolean("cancelStyle", z);
        m.putString("defaultInput", str2);
        inputNameSheetFragment.setArguments(m);
        inputNameSheetFragment.LJLJL = interfaceC193237iB;
        return inputNameSheetFragment;
    }

    public static void LIZIZ(FragmentManager fragmentManager, String str, String str2, String str3, boolean z, boolean z2, InterfaceC193237iB interfaceC193237iB) {
        ASL asl = new ASL();
        asl.LJI(1);
        asl.LJFF(16);
        InputNameSheetFragment LIZ = LIZ(str, str2, str3, z, z2, interfaceC193237iB);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = LIZ;
        tuxSheet.show(fragmentManager, "VideoCollectionChoose");
    }
}
