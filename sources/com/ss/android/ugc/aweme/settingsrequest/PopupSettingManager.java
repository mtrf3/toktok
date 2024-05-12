package com.ss.android.ugc.aweme.settingsrequest;

import X.C16880lQ;
import X.C36809EcX;
import X.C38333F2r;
import X.C46104I7o;
import X.C5S1;
import X.C76L;
import X.E4Q;
import X.EF7;
import X.FGR;
import X.InterfaceC64989Pez;
import Y.ACallableS78S0101000_6;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupResponse;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class PopupSettingManager implements WeakHandler.IHandler {
    public static final String URL_PRE;
    public static PopupSettingRequestApi popupSettingRequestApi;
    public Map<WeakHandler, Integer> callbackMap;
    public WeakHandler mHandler;
    public Map<String, PopupSetting> mPopupSettings;
    public volatile boolean requesting;

    /* loaded from: classes7.dex */
    public interface PopupSettingRequestApi {
        @E4Q("/aweme/v1/user/popup/")
        C76L<PopupResponse> requestPopupConfig(@InterfaceC64989Pez("post_video_status") String str);
    }

    public String resolvePublishPermission(int i) {
        return i != 0 ? i != 2 ? "2" : "3" : "1";
    }

    static {
        String str = Api.LIZ;
        URL_PRE = str;
        popupSettingRequestApi = (PopupSettingRequestApi) C46104I7o.LJIIZILJ(str, PopupSettingRequestApi.class);
    }

    public PopupSettingManager() {
        this.callbackMap = new ConcurrentHashMap();
        this.requesting = false;
        this.mHandler = new WeakHandler(this);
        this.mPopupSettings = new HashMap();
    }

    public static PopupSettingManager inst() {
        return C36809EcX.LIZ;
    }

    public /* synthetic */ PopupSettingManager(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        this();
    }

    public PopupSetting getPopupSetting(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PopupSetting popupSetting = this.mPopupSettings.get(str);
        this.mPopupSettings.put(str, null);
        return popupSetting;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        List<PopupSetting> list;
        Object obj = message.obj;
        int i = message.what;
        this.requesting = false;
        if (obj instanceof C38333F2r) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(((C38333F2r) obj).getErrorMsg());
            c5s1.LJ();
            return;
        }
        if (obj instanceof Exception) {
            C5S1 c5s12 = new C5S1(EF7.LIZIZ());
            c5s12.LIZLLL(EF7.LIZIZ().getResources().getString(R.string.imh));
            c5s12.LJ();
            return;
        }
        if (!(obj instanceof PopupResponse) || i != 1 || (list = ((PopupResponse) obj).popups) == null) {
            return;
        }
        for (PopupSetting popupSetting : list) {
            if (popupSetting != null) {
                try {
                    String str = popupSetting.id;
                    if (!TextUtils.isEmpty(str)) {
                        this.mPopupSettings.put(str, popupSetting);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        Iterator<Map.Entry<WeakHandler, Integer>> it = this.callbackMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<WeakHandler, Integer> next = it.next();
            next.getKey().sendEmptyMessage(next.getValue().intValue());
            it.remove();
        }
    }

    private void requestPopupConfig(WeakHandler weakHandler, int i) {
        FGR.LIZIZ().LIZ(weakHandler, new ACallableS78S0101000_6(i, this, 2), 1);
    }

    public void requestPopupConfigAsync(WeakHandler weakHandler, int i, int i2) {
        this.callbackMap.put(weakHandler, Integer.valueOf(i));
        synchronized (this) {
            if (this.requesting) {
                return;
            }
            this.requesting = true;
            requestPopupConfig(this.mHandler, i2);
        }
    }
}
