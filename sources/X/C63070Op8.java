package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.Op8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63070Op8 {
    public static final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public static final LinkedList<String> LIZIZ = new LinkedList<>();

    public static final boolean LIZ(Challenge challenge) {
        o.LJIIIZ(challenge, "<this>");
        if (challenge.isCommerce() || challenge.isCommerceAndValid()) {
            return true;
        }
        String schema = challenge.getSchema();
        if (schema != null && schema.length() != 0) {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(challenge.getSchema()), "is_commerce");
            if (o.LJ(queryParameter, "1") || ujb.o.LJJJJIZL("true", queryParameter, true)) {
                return true;
            }
        }
        return false;
    }

    public static final void LIZIZ(String str) {
        int i;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZLLL(str);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public static void LIZLLL(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        LinkedList<String> linkedList = LIZIZ;
        linkedList.remove(str);
        linkedList.add(str);
        while (true) {
            LinkedList<String> linkedList2 = LIZIZ;
            if (linkedList2.size() > 100) {
                linkedList2.removeFirst();
            } else {
                return;
            }
        }
    }

    public static final void LIZJ(android.net.Uri uri, String str) {
        int i;
        if (uri != null) {
            int i2 = 0;
            if (str == null || str.length() == 0) {
                return;
            }
            String queryParameter = UriProtector.getQueryParameter(uri, "is_commerce");
            if (o.LJ(queryParameter, "1") || ujb.o.LJJJJIZL("true", queryParameter, true)) {
                ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    LIZLLL(str);
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
        }
    }
}
