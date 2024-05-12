package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* renamed from: X.QvQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68556QvQ implements InterfaceC68664QxA {
    public static final C68192QpY LIZ;
    public static final C68192QpY LIZIZ;
    public static final C68192QpY LIZJ;
    public static final C68604QwC LIZLLL;
    public static final C68604QwC LJ;
    public static final C68192QpY LJFF;
    public static final C68192QpY LJI;
    public static final C68192QpY LJII;
    public static final C68192QpY LJIIIIZZ;
    public static final C68192QpY LJIIIZ;
    public static final C68192QpY LJIIJ;
    public static final C68192QpY LJIIJJI;
    public static final C68192QpY LJIIL;
    public static final C68192QpY LJIILIIL;
    public static final C68192QpY LJIILJJIL;
    public static final C68192QpY LJIILL;
    public static final C68192QpY LJIILLIIL;
    public static final C68192QpY LJIIZILJ;
    public static final C68192QpY LJIJ;
    public static final C68192QpY LJIJI;
    public static final C68192QpY LJIJJ;
    public static final C68192QpY LJIJJLI;
    public static final C68192QpY LJIL;
    public static final C68192QpY LJJ;
    public static final C68192QpY LJJI;
    public static final C68192QpY LJJIFFI;
    public static final C68192QpY LJJII;
    public static final C68192QpY LJJIII;
    public static final C68192QpY LJJIIJ;
    public static final C68192QpY LJJIIJZLJL;
    public static final C68192QpY LJJIIZ;
    public static final C68192QpY LJJIIZI;
    public static final C68192QpY LJJIJ;
    public static final C68192QpY LJJIJIIJI;
    public static final C68604QwC LJJIJIIJIL;
    public static final C68192QpY LJJIJIL;

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZ();
        LIZ = LIZ2.LIZJ(10000L, "measurement.ad_id_cache_time");
        LIZIZ = LIZ2.LIZJ(100L, "measurement.max_bundles_per_iteration");
        LIZJ = LIZ2.LIZJ(86400000L, "measurement.config.cache_time");
        LIZ2.LIZLLL("measurement.log_tag", "FA");
        LIZLLL = new C68604QwC(LIZ2, "measurement.config.url_authority", "app-measurement.com");
        LJ = new C68604QwC(LIZ2, "measurement.config.url_scheme", "https");
        LJFF = LIZ2.LIZJ(1000L, "measurement.upload.debug_upload_interval");
        LJI = LIZ2.LIZJ(4L, "measurement.lifetimevalue.max_currency_tracked");
        LJII = LIZ2.LIZJ(100000L, "measurement.store.max_stored_events_per_app");
        LJIIIIZZ = LIZ2.LIZJ(50L, "measurement.experiment.max_ids");
        LJIIIZ = LIZ2.LIZJ(200L, "measurement.audience.filter_result_max_count");
        LJIIJ = LIZ2.LIZJ(60000L, "measurement.alarm_manager.minimum_interval");
        LJIIJJI = LIZ2.LIZJ(500L, "measurement.upload.minimum_delay");
        LJIIL = LIZ2.LIZJ(86400000L, "measurement.monitoring.sample_period_millis");
        LJIILIIL = LIZ2.LIZJ(10000L, "measurement.upload.realtime_upload_interval");
        LJIILJJIL = LIZ2.LIZJ(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        LIZ2.LIZJ(3600000L, "measurement.config.cache_time.service");
        LJIILL = LIZ2.LIZJ(5000L, "measurement.service_client.idle_disconnect_millis");
        LIZ2.LIZLLL("measurement.log_tag.service", "FA-SVC");
        LJIILLIIL = LIZ2.LIZJ(86400000L, "measurement.upload.stale_data_deletion_interval");
        LJIIZILJ = LIZ2.LIZJ(604800000L, "measurement.sdk.attribution.cache.ttl");
        LJIJ = LIZ2.LIZJ(7200000L, "measurement.redaction.app_instance_id.ttl");
        LJIJI = LIZ2.LIZJ(43200000L, "measurement.upload.backoff_period");
        LJIJJ = LIZ2.LIZJ(LivePlayEnforceIntervalSetting.DEFAULT, "measurement.upload.initial_upload_delay_time");
        LJIJJLI = LIZ2.LIZJ(3600000L, "measurement.upload.interval");
        LJIL = LIZ2.LIZJ(65536L, "measurement.upload.max_bundle_size");
        LJJ = LIZ2.LIZJ(100L, "measurement.upload.max_bundles");
        LJJI = LIZ2.LIZJ(500L, "measurement.upload.max_conversions_per_day");
        LJJIFFI = LIZ2.LIZJ(1000L, "measurement.upload.max_error_events_per_day");
        LJJII = LIZ2.LIZJ(1000L, "measurement.upload.max_events_per_bundle");
        LJJIII = LIZ2.LIZJ(100000L, "measurement.upload.max_events_per_day");
        LJJIIJ = LIZ2.LIZJ(50000L, "measurement.upload.max_public_events_per_day");
        LJJIIJZLJL = LIZ2.LIZJ(2419200000L, "measurement.upload.max_queue_time");
        LJJIIZ = LIZ2.LIZJ(10L, "measurement.upload.max_realtime_events_per_day");
        LJJIIZI = LIZ2.LIZJ(65536L, "measurement.upload.max_batch_size");
        LJJIJ = LIZ2.LIZJ(6L, "measurement.upload.retry_count");
        LJJIJIIJI = LIZ2.LIZJ(1800000L, "measurement.upload.retry_time");
        LJJIJIIJIL = new C68604QwC(LIZ2, "measurement.upload.url", "https://app-measurement.com/a");
        LJJIJIL = LIZ2.LIZJ(3600000L, "measurement.upload.window_interval");
    }

    @Override // X.InterfaceC68664QxA
    public final long LIZ() {
        return ((Long) LIZIZ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LIZIZ() {
        return ((Long) LIZJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LIZJ() {
        return ((Long) LJIIIIZZ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LIZLLL() {
        return ((Long) LJFF.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJ() {
        return ((Long) LJI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJFF() {
        return ((Long) LJIJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJI() {
        return ((Long) LJIIIZ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJII() {
        return ((Long) LJIIJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIIIIZZ() {
        return ((Long) LJII.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIIIZ() {
        return ((Long) LJIILLIIL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIIJ() {
        return ((Long) LJIILIIL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIIJJI() {
        return ((Long) LJIIJJI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIIL() {
        return ((Long) LJIIL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIILIIL() {
        return ((Long) LJIJJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIILJJIL() {
        return ((Long) LJJIFFI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIILLIIL() {
        return ((Long) LJIILL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJIIZILJ() {
        return ((Long) LJIILJJIL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJIII() {
        return ((Long) LJIIZILJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJIJIIJIL() {
        return ((Long) LJIJJLI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJ() {
        return ((Long) LJJIIJZLJL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJI() {
        return ((Long) LJJIJIIJI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJIZL() {
        return ((Long) LJIJI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJJ() {
        return ((Long) LJIL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJJL() {
        return ((Long) LJJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJL() {
        return ((Long) LJJII.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJLI() {
        return ((Long) LJJIII.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJLL() {
        return ((Long) LJJI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJZ() {
        return ((Long) LJJIIZ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJJZI() {
        return ((Long) LJJIIJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJLIIL() {
        return ((Long) LJJIJIL.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJLL() {
        return ((Long) LJJIIZI.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final long LJJJLZIJ() {
        return ((Long) LJJIJ.LIZIZ()).longValue();
    }

    @Override // X.InterfaceC68664QxA
    public final String LJJJZ() {
        return (String) LJJIJIIJIL.LIZIZ();
    }

    @Override // X.InterfaceC68664QxA
    public final String LJJL() {
        return (String) LIZLLL.LIZIZ();
    }

    @Override // X.InterfaceC68664QxA
    public final String LJJLI() {
        return (String) LJ.LIZIZ();
    }

    @Override // X.InterfaceC68664QxA
    public final long zza() {
        return ((Long) LIZ.LIZIZ()).longValue();
    }
}
