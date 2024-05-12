package com.bytedance.helios.sdk.jsb;

import X.AbstractC66064PwK;
import X.C66059PwF;
import X.IIO;
import Y.ARunnableS30S0200000_11;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class JsbEventFetcherImpl extends AbstractC66064PwK {
    public final LinkedList<IIO> mJsbEventList = new LinkedList<>();

    @Override // X.AbstractC66064PwK
    public List<IIO> getJsbEvents() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int size = this.mJsbEventList.size() - 1; size >= 0; size--) {
            IIO iio = this.mJsbEventList.get(size);
            o.LJIIIIZZ(iio, "mJsbEventList[i]");
            IIO iio2 = iio;
            if (currentTimeMillis - iio2.LJLJJI > getTIMEOUT_MILLS() + getDELAYED_MILLS()) {
                break;
            }
            arrayList.add(iio2);
        }
        return arrayList;
    }

    public JsbEventFetcherImpl() {
        C66059PwF.LIZLLL = this;
    }

    private final long getDELAYED_MILLS() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        return heliosEnvImpl.LJIIJ.crpConfig.reportDelayedMills;
    }

    private final long getTIMEOUT_MILLS() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        return heliosEnvImpl.LJIIJ.crpConfig.eventTimeOutMills;
    }

    public final IIO removeTimeOutEvents() {
        long currentTimeMillis = System.currentTimeMillis();
        ListIterator<IIO> listIterator = this.mJsbEventList.listIterator();
        o.LJIIIIZZ(listIterator, "mJsbEventList.listIterator()");
        IIO iio = null;
        while (listIterator.hasNext()) {
            iio = listIterator.next();
            if (currentTimeMillis - iio.LJLJJI < getTIMEOUT_MILLS()) {
                break;
            }
            listIterator.remove();
        }
        return iio;
    }

    @Override // X.AbstractC66064PwK
    public void addJsbEvent(IIO event) {
        o.LJIIIZ(event, "event");
        C66059PwF.LIZIZ.post(new ARunnableS30S0200000_11(event, this, 6));
    }
}
