package X;

import android.content.Context;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.tux.input.TuxTextView;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.SkS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72972SkS {
    public static ViewModelStore LIZ(InterfaceC93923mO interfaceC93923mO, String str) {
        ViewModelStore viewModelStore = C86793Y4n.LJIL(interfaceC93923mO.getCurrentLifeCycleOwner()).getViewModelStore();
        o.LJIIIIZZ(viewModelStore, str);
        return viewModelStore;
    }

    public static C88444YnQ LIZIZ(LinkedList linkedList, C88444YnQ c88444YnQ) {
        linkedList.add(c88444YnQ);
        return new C88444YnQ();
    }

    public static String LIZLLL(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static StringBuilder LJFF(String str, char c) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(c);
        return LIZ;
    }

    public static Integer LIZJ(TuxTextView tuxTextView, String str, int i) {
        Context context = tuxTextView.getContext();
        o.LJIIIIZZ(context, str);
        return C79045V0n.LJI(i, context);
    }

    public static String LJ(Context context, String str, int i, String str2) {
        o.LJIIIZ(context, str);
        String string = context.getResources().getString(i);
        o.LJIIIIZZ(string, str2);
        return string;
    }

    public static void LJI(StringBuilder sb, long j, StringBuilder sb2, String str) {
        sb.append(j);
        C32014ChO.LJFF(str, X1D.LIZIZ(sb2));
    }
}
