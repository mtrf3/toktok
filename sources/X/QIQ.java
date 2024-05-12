package X;

/* loaded from: classes12.dex */
public enum QIQ {
    monitor_default,
    event,
    event_v3,
    log_data,
    item_impression,
    launch,
    terminate,
    real_event,
    pack,
    database,
    register,
    active,
    config,
    ab_config,
    engine,
    log_send,
    migrate_old,
    f_cache_event,
    filtered_event,
    f_db_insert_event,
    f_to_pack_event,
    sampling_event,
    f_to_bytes_event,
    f_to_bytes_encrypt_event,
    large_event,
    f_expire_event,
    f_oom_event;

    public static QIQ valueOf(String str) {
        return (QIQ) V0N.LJJJ(QIQ.class, str);
    }
}
