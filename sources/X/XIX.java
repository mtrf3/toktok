package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public final class XIX implements Runnable {
    public static final XIX LJLIL = new XIX();

    public static void LIZ() {
        AtomicBoolean atomicBoolean = XIW.LIZ;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        XIW.LIZIZ(XIW.LIZ(XIW.LIZJ), "assem_feed_total_assemble_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LIZLLL), "assem_feed_total_assem_create_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LJ), "assem_feed_total_assem_dsl_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LJFF), "assem_on_proxy_bind_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LJI), "assem_feed_total_assem_view_model_create_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LJII), "assem_feed_total_assem_hierarchy_data_create_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LJIIIIZZ), "assem_feed_total_assem_select_subscribe_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LJIIIZ), "vporvider_feed_total_create_vscope_instance");
        XIW.LIZIZ(XIW.LIZ(XIW.LJIIJ), "vporvider_feed_total_provide_duration");
        XIW.LIZIZ(XIW.LIZ(XIW.LJIIJJI), "vporvider_feed_total_bind_duration");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
