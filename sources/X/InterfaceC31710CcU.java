package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.Enum;
import java.util.List;

/* renamed from: X.CcU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31710CcU<W, VM extends ViewModel, T extends Enum<T>> {
    String LIZ();

    List<EnumC29188Bcu> LLJJJ();

    W LLJJJIL();

    void LLJJJJ(VM vm, A72 a72);

    boolean LLJJJJJIL();

    T LLJJJJLIIL();

    void LLJJL(String str);

    void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> map, InterfaceC25704A6y interfaceC25704A6y);

    List<Integer> getMessageType();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onDispose();

    void onEvent(Boolean bool);

    void onMessage(IMessage iMessage);

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
