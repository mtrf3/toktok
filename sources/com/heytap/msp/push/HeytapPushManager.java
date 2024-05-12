package com.heytap.msp.push;

import android.content.Context;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes28.dex */
public class HeytapPushManager {
    public static void clearNotificationType() {
        clearNotificationType(null);
    }

    public static void clearNotifications() {
        clearNotifications(null);
    }

    public static void getNotificationStatus() {
        getNotificationStatus(null);
    }

    public static ICallBackResultService getPushCallback() {
        return PushService.a.a.getPushCallback();
    }

    public static void getPushStatus() {
        PushService.a.a.getPushStatus();
    }

    public static int getPushVersionCode() {
        return PushService.a.a.getPushVersionCode();
    }

    public static String getPushVersionName() {
        return PushService.a.a.getPushVersionName();
    }

    public static void getRegister() {
        getRegister(null);
    }

    public static String getRegisterID() {
        return PushService.a.a.getRegisterID();
    }

    public static int getSDKVersionCode() {
        return PushService.getSDKVersionCode();
    }

    public static String getSDKVersionName() {
        return PushService.getSDKVersionName();
    }

    public static void openNotificationSettings() {
        openNotificationSettings(null);
    }

    public static void pausePush() {
        pausePush(null);
    }

    public static void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    public static void requestNotificationPermission() {
        PushService.a.a.requestNotificationPermission();
    }

    public static void resumePush() {
        resumePush(null);
    }

    public static void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    public static void statisticEvent(Context context, String str, DataMessage dataMessage) {
        StatisticUtils.statisticEvent(context, str, dataMessage);
    }

    public static void statisticMessage(Context context, MessageStat messageStat) {
        StatUtil.statisticMessage(context, messageStat);
    }

    public static void statisticMessage(Context context, List<MessageStat> list) {
        StatUtil.statisticMessage(context, list);
    }

    public static void unRegister() {
        unRegister(null);
    }

    public static void clearNotificationType(JSONObject jSONObject) {
        PushService.a.a.clearNotificationType(jSONObject);
    }

    public static void clearNotifications(JSONObject jSONObject) {
        PushService.a.a.clearNotifications(jSONObject);
    }

    public static void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        PushService.a.a.disableAppNotificationSwitch(iSetAppNotificationCallBackService);
    }

    public static void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        PushService.a.a.enableAppNotificationSwitch(iSetAppNotificationCallBackService);
    }

    public static void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        PushService.a.a.getAppNotificationSwitch(iGetAppNotificationCallBackService);
    }

    public static String getMcsPackageName(Context context) {
        return PushService.a.a.getMcsPackageName(context);
    }

    public static void getNotificationStatus(JSONObject jSONObject) {
        PushService.a.a.getNotificationStatus(jSONObject);
    }

    public static String getReceiveSdkAction(Context context) {
        return PushService.a.a.getReceiveSdkAction(context);
    }

    public static void getRegister(JSONObject jSONObject) {
        PushService.a.a.getRegister(jSONObject);
    }

    public static boolean isSupportPush(Context context) {
        return PushService.a.a.isSupportPushByClient(context);
    }

    public static void openNotificationSettings(JSONObject jSONObject) {
        PushService.a.a.openNotificationSettings(jSONObject);
    }

    public static void pausePush(JSONObject jSONObject) {
        PushService.a.a.pausePush(jSONObject);
    }

    public static void resumePush(JSONObject jSONObject) {
        PushService.a.a.resumePush(jSONObject);
    }

    public static void setPushCallback(ICallBackResultService iCallBackResultService) {
        PushService.a.a.setPushCallback(iCallBackResultService);
    }

    public static void setRegisterID(String str) {
        PushService.a.a.setRegisterID(str);
    }

    public static void unRegister(JSONObject jSONObject) {
        PushService.a.a.unRegister(jSONObject);
    }

    public static void init(Context context, boolean z) {
        PushService.a.a.init(context, z);
    }

    public static void setAppKeySecret(String str, String str2) {
        PushService.a.a.setAppKeySecret(str, str2);
    }

    public static void setNotificationType(int i, JSONObject jSONObject) {
        PushService.a.a.setNotificationType(i, jSONObject);
    }

    public static void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        PushService.a.a.register(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        PushService.a.a.unRegister(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        PushService.a.a.setPushTime(list, i, i2, i3, i4, jSONObject);
    }
}
