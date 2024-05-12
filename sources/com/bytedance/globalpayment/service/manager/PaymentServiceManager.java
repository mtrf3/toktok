package com.bytedance.globalpayment.service.manager;

import android.text.TextUtils;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class PaymentServiceManager {
    public static volatile AmazonIapExternalService mAmazonIapExternalService;
    public static volatile GoogleIapExternalService mGoogleIapExternalService;
    public static volatile IapExternalService mIapExternalService;
    public static volatile PaymentServiceManager mServiceManagerInstance;
    public Map<String, String> classNameMap;
    public Map<String, Object> instanceManager = new HashMap();

    public static PaymentServiceManager get() {
        if (mServiceManagerInstance == null) {
            synchronized (PaymentServiceManager.class) {
                if (mServiceManagerInstance == null) {
                    mServiceManagerInstance = new PaymentServiceManager();
                }
            }
        }
        return mServiceManagerInstance;
    }

    public AmazonIapExternalService getAmazonIapExternalService() {
        if (mAmazonIapExternalService == null) {
            synchronized (this) {
                if (mAmazonIapExternalService == null) {
                    Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService"));
                    if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService"), "com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalServiceImplOfMock")) != null)) {
                        mAmazonIapExternalService = (AmazonIapExternalService) objectInstance;
                    } else {
                        throw new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService");
                    }
                }
            }
        }
        return mAmazonIapExternalService;
    }

    public GoogleIapExternalService getGoogleIapExternalService() {
        if (mGoogleIapExternalService == null) {
            synchronized (this) {
                if (mGoogleIapExternalService == null) {
                    Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService"));
                    if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService"), "com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalServiceImplOfMock")) != null)) {
                        mGoogleIapExternalService = (GoogleIapExternalService) objectInstance;
                    } else {
                        throw new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService");
                    }
                }
            }
        }
        return mGoogleIapExternalService;
    }

    public IapExternalService getIapExternalService() {
        if (mIapExternalService == null) {
            synchronized (this) {
                if (mIapExternalService == null) {
                    Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.IapExternalService"));
                    if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.IapExternalService"), "com.bytedance.globalpayment.service.manager.iap.IapExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.IapExternalServiceImplOfMock")) != null)) {
                        mIapExternalService = (IapExternalService) objectInstance;
                    } else {
                        throw new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.IapExternalService");
                    }
                }
            }
        }
        return mIapExternalService;
    }

    public PaymentServiceManager() {
        HashMap hashMap = new HashMap();
        this.classNameMap = hashMap;
        hashMap.put("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService", "com.bytedance.globalpayment.iap.amazon.service.provider.AmazonIapServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService", "com.bytedance.globalpayment.iap.google.service.provider.GoogleIapExternalServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.iap.IapExternalService", "com.bytedance.globalpayment.iap.service.provider.IapServiceProvider");
    }

    private Object getObjectInstance(String str) {
        if (this.instanceManager.containsKey(str)) {
            return this.instanceManager.get(str);
        }
        try {
            Object newInstance = Class.forName(str).newInstance();
            this.instanceManager.put(str, newInstance);
            return newInstance;
        } catch (Throwable unused) {
            return null;
        }
    }
}
