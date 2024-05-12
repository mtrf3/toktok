package com.ss.bduploader.util;

import X.C16880lQ;
import X.EZX;
import com.ss.bduploader.BDUploadUtil;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public class BDUrlDispatch {
    public static volatile BDUrlDispatch mInstance;
    public final ReentrantReadWriteLock mDispatchlock = new ReentrantReadWriteLock();
    public long mDispatchDuration = -1;
    public String mTncTag = null;

    public static BDUrlDispatch inst() {
        if (mInstance == null) {
            synchronized (BDUrlDispatch.class) {
                if (mInstance == null) {
                    mInstance = new BDUrlDispatch();
                }
            }
        }
        return mInstance;
    }

    private String doOkHttpDispatchPrivate(String str, String str2) {
        Class<?> cls = Class.forName("ee1.l");
        Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
        Boolean bool = (Boolean) cls.getMethod("isDispatchActionsEmpty", new Class[0]).invoke(invoke, new Object[0]);
        this.mTncTag = (String) cls.getMethod("getTncEtag", new Class[0]).invoke(invoke, new Object[0]);
        if (!bool.booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            Class<?> cls2 = Class.forName("ee1.m");
            Object invoke2 = cls.getMethod("getDispatchResultForUrl", cls2).invoke(invoke, cls2.getConstructor(String.class, String.class).newInstance(str, str2));
            this.mDispatchDuration = System.currentTimeMillis() - currentTimeMillis;
            if (invoke2 != null) {
                Class<?> cls3 = Class.forName("ee1.e");
                String str3 = (String) cls3.getField("mDispatchedURL").get(invoke2);
                if (!str.equals(str3)) {
                    List list = (List) cls3.getField("mActionRuleIdList").get(invoke2);
                    if (!str3.isEmpty() || list.isEmpty()) {
                        if (EZX.LIZ(str3)) {
                            return str3;
                        }
                        return str;
                    }
                    throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555");
                }
                return str;
            }
            return str;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        String str4 = (String) cls.getMethod("handleHostMapping", String.class).invoke(invoke, str);
        this.mDispatchDuration = System.currentTimeMillis() - currentTimeMillis2;
        if (str.equals(str4) || !EZX.LIZ(str4)) {
            return str;
        }
        return str4;
    }

    public String getDispatchUrl(String str, String str2) {
        String str3;
        this.mDispatchlock.writeLock().lock();
        this.mDispatchDuration = -1L;
        try {
            str3 = doOkHttpDispatchPrivate(str, str2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            if (BDUploadUtil.urlDispatch != null) {
                str3 = BDUploadUtil.urlDispatch.doDispatchUrl(str, str2);
            } else {
                str3 = null;
            }
        }
        this.mDispatchlock.writeLock().unlock();
        return str3;
    }
}
