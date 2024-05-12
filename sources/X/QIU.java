package X;

/* loaded from: classes12.dex */
public enum QIU {
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

    public static QIU valueOf(String str) {
        return (QIU) V0N.LJJJ(QIU.class, str);
    }
}
