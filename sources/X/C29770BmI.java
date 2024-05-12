package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.FansConfig;

/* renamed from: X.BmI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29770BmI extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C29770BmI INSTANCE = new C29770BmI();

    public C29770BmI() {
        super(0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<String> configStringList = InterfaceC30442Bx8.l2.LIZJ();
        o.LJIIIIZZ(configStringList, "configStringList");
        if ((!configStringList.isEmpty()) && !C29771BmJ.LJII) {
            ArrayList arrayList = new ArrayList();
            Gson gson = new Gson();
            for (String str : configStringList) {
                try {
                    arrayList.add((FansConfig) gson.LJI(str, FansConfig.class));
                } catch (Throwable unused) {
                    C29794Bmg.LIZ("fans_club", str);
                }
            }
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS41S0100000_5(arrayList, 341));
        }
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
