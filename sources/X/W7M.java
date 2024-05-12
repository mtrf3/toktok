package X;

/* loaded from: classes15.dex */
public final class W7M implements InterfaceC81759W6x<W8X> {
    public final W6M<W6U, InterfaceC81378Vwk> LIZ;
    public final W6O LIZIZ;
    public final InterfaceC81759W6x<W8X> LIZJ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        java.util.Map map;
        try {
            C81939WDv.LIZIZ();
            String id = interfaceC81770W7i.getId();
            InterfaceC81754W6s LIZ = interfaceC81770W7i.LIZ();
            LIZ.LIZ(id, "EncodedMemoryCacheProducer");
            C245519kJ LIZ2 = this.LIZIZ.LIZ(interfaceC81770W7i.LJ(), interfaceC81770W7i.LIZIZ());
            C81392Vwy LJFF = this.LIZ.LJFF(LIZ2);
            java.util.Map map2 = null;
            try {
                if (LJFF != null) {
                    W8X w8x = new W8X(LJFF);
                    try {
                        if (LIZ.LJIIIZ(id)) {
                            map2 = C65618Pp8.of("cached_value_found", "true");
                        }
                        LIZ.LIZIZ(id, "EncodedMemoryCacheProducer", map2);
                        LIZ.LIZLLL(id, "EncodedMemoryCacheProducer", true);
                        w7f.LIZ(1.0f);
                        w7f.LIZIZ(1, w8x);
                        return;
                    } finally {
                        W8X.LIZIZ(w8x);
                    }
                }
                if (interfaceC81770W7i.LJI().getValue() >= W50.ENCODED_MEMORY_CACHE.getValue()) {
                    if (LIZ.LJIIIZ(id)) {
                        map = C65618Pp8.of("cached_value_found", "false");
                    } else {
                        map = null;
                    }
                    LIZ.LIZIZ(id, "EncodedMemoryCacheProducer", map);
                    LIZ.LIZLLL(id, "EncodedMemoryCacheProducer", false);
                    w7f.LIZIZ(1, null);
                    return;
                }
                W7O w7o = new W7O(w7f, this.LIZ, LIZ2, interfaceC81770W7i.LJ().LJIILL);
                if (LIZ.LJIIIZ(id)) {
                    map2 = C65618Pp8.of("cached_value_found", "false");
                }
                LIZ.LIZIZ(id, "EncodedMemoryCacheProducer", map2);
                this.LIZJ.LIZIZ(w7o, interfaceC81770W7i);
            } finally {
                C81392Vwy.LJ(LJFF);
            }
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public W7M(W6M<W6U, InterfaceC81378Vwk> w6m, W6O w6o, InterfaceC81759W6x<W8X> interfaceC81759W6x) {
        this.LIZ = w6m;
        this.LIZIZ = w6o;
        this.LIZJ = interfaceC81759W6x;
    }
}
