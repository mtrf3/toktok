package X;

/* loaded from: classes12.dex */
public enum PX3 {
    IDLE,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_STALLED_SOCKET_POOL,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_AVAILABLE_SOCKET,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_DELEGATE,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_CACHE,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_APPCACHE,
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOADING_PAC_FILE,
    /* JADX INFO: Fake field, exist only in values array */
    RESOLVING_PROXY_FOR_URL,
    /* JADX INFO: Fake field, exist only in values array */
    RESOLVING_HOST_IN_PAC_FILE,
    /* JADX INFO: Fake field, exist only in values array */
    ESTABLISHING_PROXY_TUNNEL,
    RESOLVING_HOST,
    CONNECTING,
    SSL_HANDSHAKE,
    SENDING_REQUEST,
    WAITING_FOR_RESPONSE,
    READING_RESPONSE;

    public static PX3 valueOf(String str) {
        return (PX3) V0N.LJJJ(PX3.class, str);
    }
}
