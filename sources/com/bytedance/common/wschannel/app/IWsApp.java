package com.bytedance.common.wschannel.app;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface IWsApp extends Parcelable {
    String LIZJ();

    Map<String, String> LJFF();

    JSONObject LJJIII();

    int LJJLI();

    List<Integer> LJLLL();

    int LLJJJJLIIL();

    boolean LLLIILIL();

    List<Integer> LLLLILI();

    String LLLLLIL();

    List<String> LLLLZ();

    int LLLZLL();

    boolean g();

    int getAppId();

    String getAppKey();

    int getAppVersion();

    String getDeviceId();

    String getExtra();

    int getPlatform();
}
