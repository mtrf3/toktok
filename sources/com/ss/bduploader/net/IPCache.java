package com.ss.bduploader.net;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class IPCache {
    public static IPCache mInstance = null;
    public static String mNetExtraInfo = null;
    public static int mNetType = -1;
    public ConcurrentHashMap<String, BDUploadDNSInfo> mDNSRecord = new ConcurrentHashMap<>();
    public Lock lock = new ReentrantLock();

    public static IPCache getInstance() {
        if (mInstance == null) {
            synchronized (IPCache.class) {
                if (mInstance == null) {
                    mInstance = new IPCache();
                }
            }
        }
        return mInstance;
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int getRecordSize() {
        int i;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                i = concurrentHashMap.size();
            } else {
                i = -1;
            }
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    public BDUploadDNSInfo get(String str) {
        BDUploadDNSInfo bDUploadDNSInfo;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                bDUploadDNSInfo = concurrentHashMap.get(str);
            } else {
                bDUploadDNSInfo = null;
            }
            return bDUploadDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public void put(String str, BDUploadDNSInfo bDUploadDNSInfo) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, bDUploadDNSInfo);
            }
        } finally {
            this.lock.unlock();
        }
    }
}
