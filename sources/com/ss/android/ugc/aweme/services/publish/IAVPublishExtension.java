package com.ss.android.ugc.aweme.services.publish;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public interface IAVPublishExtension<T> {

    /* loaded from: classes8.dex */
    public interface Callback {
        void onECUpdateBC(boolean z);

        void onECUpdateBO(boolean z);
    }

    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static <T> void callbackAnchors(IAVPublishExtension<T> iAVPublishExtension, List<CreateAnchorInfo> list) {
            o.LJIIIZ(list, "list");
        }

        public static <T> UrlModel getAnchorIconUrl(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> String getAnchorText(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> boolean haveAnchors(IAVPublishExtension<T> iAVPublishExtension, int i) {
            return false;
        }

        public static <T> boolean isDisplayAnchor(IAVPublishExtension<T> iAVPublishExtension) {
            return true;
        }

        public static <T> void onAccountUpdate(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onActivityResult(IAVPublishExtension<T> iAVPublishExtension, int i, int i2, Intent intent) {
        }

        public static <T> void onBackPressed(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            o.LJIIIZ(publishOutput, "publishOutput");
        }

        public static <T> void onExtensionEnable(IAVPublishExtension<T> iAVPublishExtension, Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map) {
            o.LJIIIZ(map, "map");
        }

        public static <T> void onPublish(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            o.LJIIIZ(publishOutput, "publishOutput");
        }

        public static <T> void onResume(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onSaveDraft(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            o.LJIIIZ(publishOutput, "publishOutput");
        }

        public static <T> void registerOnAddAnchorListener(IAVPublishExtension<T> iAVPublishExtension, InterfaceC65784Pro<C76800UCe> callback) {
            o.LJIIIZ(callback, "callback");
        }

        public static <T> void unregisterOnAddAnchorListener(IAVPublishExtension<T> iAVPublishExtension, InterfaceC65784Pro<C76800UCe> callback) {
            o.LJIIIZ(callback, "callback");
        }
    }

    void callbackAnchors(List<CreateAnchorInfo> list);

    UrlModel getAnchorIconUrl();

    String getAnchorText();

    String getName();

    boolean haveAnchors(int i);

    boolean isDisplayAnchor();

    void onAccountUpdate();

    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed(PublishOutput publishOutput);

    void onCreate(Fragment fragment, View view, LifecycleOwner lifecycleOwner, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback);

    void onDestroy();

    void onExtensionEnable(Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map);

    void onPublish(PublishOutput publishOutput);

    void onResume();

    void onSaveDraft(PublishOutput publishOutput);

    T provideExtensionData();

    void registerOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void unregisterOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);
}
