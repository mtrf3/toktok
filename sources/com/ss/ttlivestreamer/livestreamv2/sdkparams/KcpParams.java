package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;

/* loaded from: classes12.dex */
public class KcpParams {

    @Serialized("wnd_recv")
    public int wndRecv = Integer.MAX_VALUE;

    @Serialized("wnd_send")
    public int wndSend = Integer.MAX_VALUE;

    @Serialized("mtu_size")
    public int mtuSize = Integer.MAX_VALUE;

    @Serialized("fast_ack")
    public int fastAck = Integer.MAX_VALUE;

    @Serialized("bwinit")
    public int bwinit = Integer.MAX_VALUE;

    @Serialized("bwmin")
    public int bwmin = Integer.MAX_VALUE;

    @Serialized("window")
    public int window = Integer.MAX_VALUE;

    @Serialized("probebw")
    public int probebw = Integer.MAX_VALUE;

    @Serialized("preempt")
    public int preempt = Integer.MAX_VALUE;

    @Serialized("jitter")
    public int jitter = Integer.MAX_VALUE;

    @Serialized("timeout")
    public int timeout = Integer.MAX_VALUE;

    @Serialized("retrans")
    public int retrans = Integer.MAX_VALUE;

    @Serialized("report")
    public int report = Integer.MAX_VALUE;

    @Serialized("lost")
    public double lost = NumberInit.UNDEFINED_DOUBLE_VALUE;

    @Serialized("fec")
    public int fec = Integer.MAX_VALUE;

    @Serialized("logmask")
    public int logMask = Integer.MAX_VALUE;
}
