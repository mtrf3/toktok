package com.bytedance.android.live.effect.api.soundeffect;

import X.AbstractC23740wU;
import X.C0BE;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C1PS;
import X.C262411g;
import X.InterfaceC09770Zx;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase_Impl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class SoundEffectDatabase_Impl extends SoundEffectDatabase {
    public volatile C1PS LJIILIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "sound_effect_database");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC09770Zx.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase
    public final InterfaceC09770Zx LJIJ() {
        C1PS c1ps;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new C1PS(this);
            }
            c1ps = this.LJIILIIL;
        }
        return c1ps;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C0BE() { // from class: X.1Gt
            @Override // X.C0BE
            public final void LJ() {
            }

            @Override // X.C0BE
            public final void LIZJ() {
                List<C0BX> list = SoundEffectDatabase_Impl.this.LJI;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(SoundEffectDatabase_Impl.this.LJI, i).getClass();
                    }
                }
            }

            {
                super(3);
            }

            @Override // X.C0BE
            public final void LIZ(C38451f7 c38451f7) {
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `sound_effect_database` (`dbId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` INTEGER NOT NULL, `name` TEXT NOT NULL, `eng_name` TEXT NOT NULL, `version` INTEGER NOT NULL, `resource_urlavg_color` TEXT, `resource_urluri` TEXT, `resource_urlurl_list` TEXT, `resource_urlopen_web_url` TEXT, `resource_urlimage_type` INTEGER, `resource_urlis_animated` INTEGER, `resource_urlwidth` INTEGER, `resource_urlheight` INTEGER, `resource_urlisLoaded` INTEGER, `resource_urlisMonitored` INTEGER, `resource_urlisFeedCandidate` INTEGER, `iconavg_color` TEXT, `iconuri` TEXT, `iconurl_list` TEXT, `iconopen_web_url` TEXT, `iconimage_type` INTEGER, `iconis_animated` INTEGER, `iconwidth` INTEGER, `iconheight` INTEGER, `iconisLoaded` INTEGER, `iconisMonitored` INTEGER, `iconisFeedCandidate` INTEGER)");
                c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1f5f69edf7ad8512f8d862dfe970fcfb')");
            }

            @Override // X.C0BE
            public final void LIZIZ(C38451f7 c38451f7) {
                c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `sound_effect_database`");
                List<C0BX> list = SoundEffectDatabase_Impl.this.LJI;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(SoundEffectDatabase_Impl.this.LJI, i).getClass();
                    }
                }
            }

            @Override // X.C0BE
            public final void LIZLLL(C38451f7 c38451f7) {
                SoundEffectDatabase_Impl.this.LIZ = c38451f7;
                SoundEffectDatabase_Impl.this.LJIIL(c38451f7);
                List<C0BX> list = SoundEffectDatabase_Impl.this.LJI;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0BX) ListProtector.get(SoundEffectDatabase_Impl.this.LJI, i)).LIZ(c38451f7);
                    }
                }
            }

            @Override // X.C0BE
            public final void LJFF(C38451f7 c38451f7) {
                C25080ye.LIZ(c38451f7);
            }

            @Override // X.C0BE
            public final C0BF LJI(C38451f7 c38451f7) {
                HashMap hashMap = new HashMap(27);
                hashMap.put("dbId", new C25090yf(1, 1, "dbId", "INTEGER", null, true));
                hashMap.put("id", new C25090yf(0, 1, "id", "INTEGER", null, true));
                hashMap.put("name", new C25090yf(0, 1, "name", "TEXT", null, true));
                hashMap.put("eng_name", new C25090yf(0, 1, "eng_name", "TEXT", null, true));
                hashMap.put("version", new C25090yf(0, 1, "version", "INTEGER", null, true));
                hashMap.put("resource_urlavg_color", new C25090yf(0, 1, "resource_urlavg_color", "TEXT", null, false));
                hashMap.put("resource_urluri", new C25090yf(0, 1, "resource_urluri", "TEXT", null, false));
                hashMap.put("resource_urlurl_list", new C25090yf(0, 1, "resource_urlurl_list", "TEXT", null, false));
                hashMap.put("resource_urlopen_web_url", new C25090yf(0, 1, "resource_urlopen_web_url", "TEXT", null, false));
                hashMap.put("resource_urlimage_type", new C25090yf(0, 1, "resource_urlimage_type", "INTEGER", null, false));
                hashMap.put("resource_urlis_animated", new C25090yf(0, 1, "resource_urlis_animated", "INTEGER", null, false));
                hashMap.put("resource_urlwidth", new C25090yf(0, 1, "resource_urlwidth", "INTEGER", null, false));
                hashMap.put("resource_urlheight", new C25090yf(0, 1, "resource_urlheight", "INTEGER", null, false));
                hashMap.put("resource_urlisLoaded", new C25090yf(0, 1, "resource_urlisLoaded", "INTEGER", null, false));
                hashMap.put("resource_urlisMonitored", new C25090yf(0, 1, "resource_urlisMonitored", "INTEGER", null, false));
                hashMap.put("resource_urlisFeedCandidate", new C25090yf(0, 1, "resource_urlisFeedCandidate", "INTEGER", null, false));
                hashMap.put("iconavg_color", new C25090yf(0, 1, "iconavg_color", "TEXT", null, false));
                hashMap.put("iconuri", new C25090yf(0, 1, "iconuri", "TEXT", null, false));
                hashMap.put("iconurl_list", new C25090yf(0, 1, "iconurl_list", "TEXT", null, false));
                hashMap.put("iconopen_web_url", new C25090yf(0, 1, "iconopen_web_url", "TEXT", null, false));
                hashMap.put("iconimage_type", new C25090yf(0, 1, "iconimage_type", "INTEGER", null, false));
                hashMap.put("iconis_animated", new C25090yf(0, 1, "iconis_animated", "INTEGER", null, false));
                hashMap.put("iconwidth", new C25090yf(0, 1, "iconwidth", "INTEGER", null, false));
                hashMap.put("iconheight", new C25090yf(0, 1, "iconheight", "INTEGER", null, false));
                hashMap.put("iconisLoaded", new C25090yf(0, 1, "iconisLoaded", "INTEGER", null, false));
                hashMap.put("iconisMonitored", new C25090yf(0, 1, "iconisMonitored", "INTEGER", null, false));
                C25130yj c25130yj = new C25130yj("sound_effect_database", hashMap, UC7.LIZIZ(hashMap, "iconisFeedCandidate", new C25090yf(0, 1, "iconisFeedCandidate", "INTEGER", null, false), 0), new HashSet(0));
                C25130yj LIZ = C25130yj.LIZ(c38451f7, "sound_effect_database");
                if (!c25130yj.equals(LIZ)) {
                    return new C0BF(false, C169696lJ.LIZJ("sound_effect_database(com.bytedance.android.live.effect.api.soundeffect.SoundEffect).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
                }
                return new C0BF(true, null);
            }
        }, "1f5f69edf7ad8512f8d862dfe970fcfb", "602aa792e5da8c5c7d64ed7e865a5651");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
