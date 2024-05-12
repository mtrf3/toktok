package com.ss.android.ugc.aweme.account.loginsetting;

import java.util.List;

/* loaded from: classes16.dex */
public class ThirdBindSettingsResponse {
    public List<BindSetting> data;
    public int status_code;
    public String status_msg;

    /* loaded from: classes16.dex */
    public static class BindSetting {
        public int bind_platform;
        public int bind_switch;
        public String bind_toast;
    }
}
