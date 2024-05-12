package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QuicParams {

    @Serialized("quic_config_json")
    public JSONObject quicConfigJson;

    @Serialized("quic_engine_param")
    public JSONObject quicEngineParam;

    @Serialized("enable_save_scfg")
    public int enableSaveScfg = Integer.MAX_VALUE;

    @Serialized("congestion_type")
    public int congestionType = Integer.MAX_VALUE;

    @Serialized("loss_detection_type")
    public int lossDetectionType = Integer.MAX_VALUE;

    @Serialized("quic_version")
    public int quicVersion = Integer.MAX_VALUE;

    @Serialized("log_level")
    public int logLevel = Integer.MAX_VALUE;

    @Serialized("adapt_est_bw_to_quic_bw")
    public int adatEstBwToQuicBw = Integer.MAX_VALUE;

    @Serialized("enable_cert_verify")
    public int enableCertVerify = Integer.MAX_VALUE;

    @Serialized("init_mtu")
    public int initMtu = Integer.MAX_VALUE;

    @Serialized("enable_mtu_discovery")
    public int enableMtuDiscovery = Integer.MAX_VALUE;

    @Serialized("init_cwnd")
    public int initCwnd = Integer.MAX_VALUE;

    @Serialized("default_retransmit_time")
    public int defaultRetransmitTime = Integer.MAX_VALUE;

    @Serialized("fix_stream_fin_and_rst")
    public int fixStreamFinAndRst = Integer.MAX_VALUE;

    @Serialized("send_buffer_size")
    public int sendBufferSize = Integer.MAX_VALUE;

    @Serialized("recv_buffer_size")
    public int recvBufferSize = Integer.MAX_VALUE;

    @Serialized("fix_packet_writer")
    public int fixPacketWriter = Integer.MAX_VALUE;

    @Serialized("ignore_socket_write_error")
    public int ignoreSocketWriterError = Integer.MAX_VALUE;

    @Serialized("bw_window_size")
    public int bwWindowSize = Integer.MAX_VALUE;

    @Serialized("rtt_window_size")
    public int rttWindowSize = Integer.MAX_VALUE;

    @Serialized("probe_bw_random_cycle_length")
    public int probeBwRandomCycleLength = Integer.MAX_VALUE;

    @Serialized("probe_rtt_gain")
    public int probeRttGain = Integer.MAX_VALUE;

    @Serialized("protocol_downgrade")
    public int protocolDowngrade = Integer.MAX_VALUE;

    @Serialized("protocol_retryTimes")
    public int protocolRetryTimes = Integer.MAX_VALUE;

    @Serialized("enable_downgrade_in_send")
    public int enableDowngradeInSend = Integer.MAX_VALUE;

    @Serialized("enable_ip_switch_opt")
    public int enableIpSwitch = Integer.MAX_VALUE;

    @Serialized("disable_ipv6")
    public int disableIpv6 = Integer.MAX_VALUE;

    @Serialized("retry_count")
    public int retryCount = Integer.MAX_VALUE;

    @Serialized("abkey_protocol_downgrade")
    public int abkeyProtocolDowngrade = Integer.MAX_VALUE;

    @Serialized("enable_bbrinfo_report")
    public int enbaleBbrInfoReport = Integer.MAX_VALUE;

    @Serialized("enable_bbr_optimize")
    public int enbaleBbrOptimize = Integer.MAX_VALUE;

    @Serialized("open_timeout")
    public int openTimeOut = Integer.MAX_VALUE;

    @Serialized("read_write_timeout")
    public int rwTimeOut = Integer.MAX_VALUE;

    @Serialized("enable_optimize_memory_copy")
    public int enableOptimizeMemoryCopy = Integer.MAX_VALUE;

    @Serialized("use_quic_time_v2")
    public int useQuicTimeV2 = Integer.MAX_VALUE;

    @Serialized("init_quic_type")
    public int initQuicType = Integer.MAX_VALUE;

    @Serialized("lsquic_open_block")
    public int lsquicOpenBlock = Integer.MAX_VALUE;

    public final int getAbkeyProtocolDowngrade() {
        return this.abkeyProtocolDowngrade;
    }

    public final int getAdatEstBwToQuicBw() {
        return this.adatEstBwToQuicBw;
    }

    public final int getBwWindowSize() {
        return this.bwWindowSize;
    }

    public final int getCongestionType() {
        return this.congestionType;
    }

    public final int getDefaultRetransmitTime() {
        return this.defaultRetransmitTime;
    }

    public final int getDisableIpv6() {
        return this.disableIpv6;
    }

    public final int getEnableCertVerify() {
        return this.enableCertVerify;
    }

    public final int getEnableDowngradeInSend() {
        return this.enableDowngradeInSend;
    }

    public final int getEnableIpSwitch() {
        return this.enableIpSwitch;
    }

    public final int getEnableMtuDiscovery() {
        return this.enableMtuDiscovery;
    }

    public final int getEnableOptimizeMemoryCopy() {
        return this.enableOptimizeMemoryCopy;
    }

    public final int getEnableSaveScfg() {
        return this.enableSaveScfg;
    }

    public final int getEnbaleBbrInfoReport() {
        return this.enbaleBbrInfoReport;
    }

    public final int getEnbaleBbrOptimize() {
        return this.enbaleBbrOptimize;
    }

    public final int getFixPacketWriter() {
        return this.fixPacketWriter;
    }

    public final int getFixStreamFinAndRst() {
        return this.fixStreamFinAndRst;
    }

    public final int getIgnoreSocketWriterError() {
        return this.ignoreSocketWriterError;
    }

    public final int getInitCwnd() {
        return this.initCwnd;
    }

    public final int getInitMtu() {
        return this.initMtu;
    }

    public final int getInitQuicType() {
        return this.initQuicType;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public final int getLossDetectionType() {
        return this.lossDetectionType;
    }

    public final int getLsquicOpenBlock() {
        return this.lsquicOpenBlock;
    }

    public final int getOpenTimeOut() {
        return this.openTimeOut;
    }

    public final int getProbeBwRandomCycleLength() {
        return this.probeBwRandomCycleLength;
    }

    public final int getProbeRttGain() {
        return this.probeRttGain;
    }

    public final int getProtocolDowngrade() {
        return this.protocolDowngrade;
    }

    public final int getProtocolRetryTimes() {
        return this.protocolRetryTimes;
    }

    public final JSONObject getQuicConfigJson() {
        return this.quicConfigJson;
    }

    public final JSONObject getQuicEngineParam() {
        return this.quicEngineParam;
    }

    public final int getQuicVersion() {
        return this.quicVersion;
    }

    public final int getRecvBufferSize() {
        return this.recvBufferSize;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final int getRttWindowSize() {
        return this.rttWindowSize;
    }

    public final int getRwTimeOut() {
        return this.rwTimeOut;
    }

    public final int getSendBufferSize() {
        return this.sendBufferSize;
    }

    public final int getUseQuicTimeV2() {
        return this.useQuicTimeV2;
    }

    public final void setAbkeyProtocolDowngrade(int i) {
        this.abkeyProtocolDowngrade = i;
    }

    public final void setAdatEstBwToQuicBw(int i) {
        this.adatEstBwToQuicBw = i;
    }

    public final void setBwWindowSize(int i) {
        this.bwWindowSize = i;
    }

    public final void setCongestionType(int i) {
        this.congestionType = i;
    }

    public final void setDefaultRetransmitTime(int i) {
        this.defaultRetransmitTime = i;
    }

    public final void setDisableIpv6(int i) {
        this.disableIpv6 = i;
    }

    public final void setEnableCertVerify(int i) {
        this.enableCertVerify = i;
    }

    public final void setEnableDowngradeInSend(int i) {
        this.enableDowngradeInSend = i;
    }

    public final void setEnableIpSwitch(int i) {
        this.enableIpSwitch = i;
    }

    public final void setEnableMtuDiscovery(int i) {
        this.enableMtuDiscovery = i;
    }

    public final void setEnableOptimizeMemoryCopy(int i) {
        this.enableOptimizeMemoryCopy = i;
    }

    public final void setEnableSaveScfg(int i) {
        this.enableSaveScfg = i;
    }

    public final void setEnbaleBbrInfoReport(int i) {
        this.enbaleBbrInfoReport = i;
    }

    public final void setEnbaleBbrOptimize(int i) {
        this.enbaleBbrOptimize = i;
    }

    public final void setFixPacketWriter(int i) {
        this.fixPacketWriter = i;
    }

    public final void setFixStreamFinAndRst(int i) {
        this.fixStreamFinAndRst = i;
    }

    public final void setIgnoreSocketWriterError(int i) {
        this.ignoreSocketWriterError = i;
    }

    public final void setInitCwnd(int i) {
        this.initCwnd = i;
    }

    public final void setInitMtu(int i) {
        this.initMtu = i;
    }

    public final void setInitQuicType(int i) {
        this.initQuicType = i;
    }

    public final void setLogLevel(int i) {
        this.logLevel = i;
    }

    public final void setLossDetectionType(int i) {
        this.lossDetectionType = i;
    }

    public final void setLsquicOpenBlock(int i) {
        this.lsquicOpenBlock = i;
    }

    public final void setOpenTimeOut(int i) {
        this.openTimeOut = i;
    }

    public final void setProbeBwRandomCycleLength(int i) {
        this.probeBwRandomCycleLength = i;
    }

    public final void setProbeRttGain(int i) {
        this.probeRttGain = i;
    }

    public final void setProtocolDowngrade(int i) {
        this.protocolDowngrade = i;
    }

    public final void setProtocolRetryTimes(int i) {
        this.protocolRetryTimes = i;
    }

    public final void setQuicConfigJson(JSONObject jSONObject) {
        this.quicConfigJson = jSONObject;
    }

    public final void setQuicEngineParam(JSONObject jSONObject) {
        this.quicEngineParam = jSONObject;
    }

    public final void setQuicVersion(int i) {
        this.quicVersion = i;
    }

    public final void setRecvBufferSize(int i) {
        this.recvBufferSize = i;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public final void setRttWindowSize(int i) {
        this.rttWindowSize = i;
    }

    public final void setRwTimeOut(int i) {
        this.rwTimeOut = i;
    }

    public final void setSendBufferSize(int i) {
        this.sendBufferSize = i;
    }

    public final void setUseQuicTimeV2(int i) {
        this.useQuicTimeV2 = i;
    }
}
