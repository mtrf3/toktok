package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M90 {
    public static String LIZ(String str) {
        StringBuilder LJFF = C72972SkS.LJFF(str, '_');
        LJFF.append(C65352Pkq.LIZ(RecUserVideoListSharedVM.class).LJFF());
        return X1D.LIZIZ(LJFF);
    }

    public static RecUserVideoListSharedVM LIZIZ(LifecycleOwner lifecycleOwner, RecUser recUser, EnumC57876MnY scene) {
        o.LJIIIZ(scene, "scene");
        return (RecUserVideoListSharedVM) new C214378bB(C65352Pkq.LIZ(RecUserVideoListSharedVM.class), new AqS159S0100000_9(recUser, 580), C214528bQ.LJLIL, C78926UyI.LJJII(lifecycleOwner, false), new AqS156S0200000_9(recUser, scene, 41), C182377Dt.INSTANCE, null, null).getValue();
    }
}
