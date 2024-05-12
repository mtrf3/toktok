package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS171S0100000_5;
import org.json.JSONObject;

/* renamed from: X.Xun, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86353Xun {
    JSONObject LIZIZ();

    void LIZLLL(boolean z);

    void LJ(ArrayList<String> arrayList);

    void LLZLI();

    void LLZLL(String str);

    void LLZLLIL();

    void LLZLLLL(LiveRoomStruct liveRoomStruct);

    void LLZZ(AqS171S0100000_5 aqS171S0100000_5);

    void LLZZJLIL(int i);

    void LLZZLLIL();

    void LLZZZIL();

    long LLZZZZ();

    void a(C32192CkG c32192CkG);

    boolean b();

    void c(LivePreviewPlayerWidget livePreviewPlayerWidget);

    void changeSRSupportScene(boolean z);

    void d();

    void destroy();

    void e(InterfaceC32195CkJ interfaceC32195CkJ);

    void f(LiveRoomStruct liveRoomStruct);

    void g();

    String getCurrentResolution();

    String getPlayerTag();

    void h();

    void i(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout, boolean z2, String str);

    void j(C51093K3l c51093K3l);

    void k(C28642BLy c28642BLy);

    C28185B4j l();

    void setMute(boolean z);

    void switchResolution(String str, VCA vca);
}
