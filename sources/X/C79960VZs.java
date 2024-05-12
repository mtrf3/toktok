package X;

import android.content.Context;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioList;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.xelements.xaudio.ActivityMonitorImpl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.VZs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79960VZs implements VZY {
    public static final String LJIJ = C16880lQ.LJLLJ(C79960VZs.class);
    public InterfaceC79962VZu LIZ;
    public C80029Vaz LIZIZ;
    public C84740XNo LIZJ;
    public C80015Val LIZLLL;
    public List<String> LJ;
    public final C79702VPu LJI;
    public C79943VZb LJIIJ;
    public InterfaceC79968Va0 LJIIJJI;
    public V1L LJIIL;
    public EnumC79963VZv LJIILIIL;
    public boolean LJIILJJIL;
    public final Context LJIIZILJ;
    public EnumC79950VZi LJFF = EnumC79950VZi.DEFAULT;
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 503));
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(VKJ.LJLIL);
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C79965VZx.LJLIL);
    public boolean LJIILL = true;
    public boolean LJIILLIIL = true;

    public final void LIZLLL() {
        boolean z = this.LJIILLIIL;
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            C80015Val c80015Val = this.LIZLLL;
            if (c80015Val == null) {
                Context LLLLL = C16880lQ.LLLLL(this.LJIIZILJ);
                o.LJFF(LLLLL, "mContext.applicationContext");
                c80015Val = new C80015Val(LLLLL);
                this.LIZLLL = c80015Val;
            }
            if (z) {
                c80029Vaz.LJJII(c80015Val);
            } else {
                c80029Vaz.LJJIJ(c80015Val);
            }
        }
    }

    @Override // X.VZY
    public final EnumC79958VZq LJ() {
        EnumC79954VZm enumC79954VZm;
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            enumC79954VZm = c80029Vaz.LJ();
        } else {
            enumC79954VZm = null;
        }
        return LIZIZ(enumC79954VZm);
    }

    @Override // X.VZY
    public final long LJFF() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            return c80029Vaz.LJJIIZ();
        }
        return 0L;
    }

    @Override // X.VZY
    public final String LJII() {
        V1L LIZ;
        String id;
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null && (LIZ = c80029Vaz.LIZ()) != null && (id = LIZ.getId()) != null) {
            return id;
        }
        return "";
    }

    @Override // X.VZY
    public final void LJIIIIZZ() {
        C80029Vaz c80029Vaz;
        C80029Vaz c80029Vaz2;
        C79943VZb c79943VZb;
        C80029Vaz c80029Vaz3 = new C80029Vaz(this.LJIIZILJ, this.LJI);
        this.LIZIZ = c80029Vaz3;
        c80029Vaz3.LJJIFFI((C79961VZt) this.LJII.getValue());
        c80029Vaz3.LJJI((C79961VZt) this.LJII.getValue());
        LJIILJJIL(this.LJFF);
        C80029Vaz c80029Vaz4 = this.LIZIZ;
        if (c80029Vaz4 != null && (c79943VZb = this.LJIIJ) != null) {
            ActivityMonitorImpl activityMonitorImpl = c79943VZb.LIZ;
            if (activityMonitorImpl != null) {
                c80029Vaz4.LJJII(new C80019Vap(activityMonitorImpl));
            }
            LJIJ();
            LJIJI();
        }
        EnumC79963VZv enumC79963VZv = this.LJIILIIL;
        if (enumC79963VZv != null && (c80029Vaz2 = this.LIZIZ) != null) {
            c80029Vaz2.LJJIJIIJI(enumC79963VZv);
        }
        LIZLLL();
        InterfaceC79968Va0 interfaceC79968Va0 = this.LJIIJJI;
        if (interfaceC79968Va0 != null && (c80029Vaz = this.LIZIZ) != null) {
            c80029Vaz.LJJIJIL(interfaceC79968Va0);
        }
        LJIJJ();
        String str = LJIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(" attached.");
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
    }

    @Override // X.VZY
    public final long LJIIJ() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            return c80029Vaz.LJJIII();
        }
        return 0L;
    }

    public final void LJIJ() {
        C80029Vaz c80029Vaz;
        C79943VZb c79943VZb = this.LJIIJ;
        if (c79943VZb != null && (c80029Vaz = this.LIZIZ) != null) {
            C84740XNo c84740XNo = this.LIZJ;
            if (c84740XNo == null) {
                c84740XNo = new C84740XNo(this.LJIIZILJ, c79943VZb.LIZIZ, c79943VZb.LIZ, c79943VZb.LIZJ);
                this.LIZJ = c84740XNo;
            }
            if (this.LJIILL) {
                c80029Vaz.LJJII(c84740XNo);
            } else {
                c80029Vaz.LJJIJ(c84740XNo);
            }
        }
    }

    public final void LJIJI() {
        C80029Vaz c80029Vaz;
        C79943VZb c79943VZb = this.LJIIJ;
        if (c79943VZb != null && (c80029Vaz = this.LIZIZ) != null) {
            List<String> list = this.LJ;
            Iterator it = ((ArrayList) this.LJIIIIZZ.getValue()).iterator();
            while (it.hasNext()) {
                c80029Vaz.LJJIJ((InterfaceC80013Vaj) it.next());
            }
            ((ArrayList) this.LJIIIIZZ.getValue()).clear();
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC79966VZy interfaceC79966VZy = c79943VZb.LIZLLL.get(it2.next());
                    if (interfaceC79966VZy != null) {
                        InterfaceC80013Vaj create = interfaceC79966VZy.create();
                        ((ArrayList) this.LJIIIIZZ.getValue()).add(create);
                        c80029Vaz.LJJII(create);
                    }
                }
            }
        }
    }

    public final void LJIJJ() {
        List<V1L> LIZIZ;
        String str;
        V1L v1l = this.LJIIL;
        InterfaceC79968Va0 interfaceC79968Va0 = this.LJIIJJI;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            Iterator<V1L> it = LIZIZ.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String id = it.next().getId();
                if (v1l != null) {
                    str = v1l.getId();
                } else {
                    str = null;
                }
                if (o.LJ(id, str)) {
                    if (i != -1) {
                        if (v1l != null) {
                            C80029Vaz c80029Vaz = this.LIZIZ;
                            if (c80029Vaz != null) {
                                c80029Vaz.LJIIJ(v1l, null);
                            }
                        } else {
                            v1l = null;
                        }
                        this.LJIIL = v1l;
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        C79967VZz c79967VZz = new C79967VZz(v1l);
        this.LJIIJJI = c79967VZz;
        C80029Vaz c80029Vaz2 = this.LIZIZ;
        if (c80029Vaz2 != null) {
            c80029Vaz2.LJJIJIL(c79967VZz);
        }
    }

    @Override // X.VZY
    public final void LJJIIJZLJL() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            c80029Vaz.LJII(new C48651J7n("STOP_FROM_PAGE_EXIT"));
            c80029Vaz.LJJIJIL(null);
            c80029Vaz.LJJIIZI();
            String str = LJIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" detached.");
            J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        }
        ((ArrayList) this.LJIIIIZZ.getValue()).clear();
        this.LIZLLL = null;
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    @Override // X.VZY
    public final int getCurrentPlaybackTime() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            return (int) c80029Vaz.getCurrentPlaybackTime();
        }
        return 0;
    }

    @Override // X.VZY
    public final int getDuration() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            return (int) c80029Vaz.getDuration();
        }
        return 0;
    }

    @Override // X.VZY
    public final void pause() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            c80029Vaz.LIZIZ(null);
        }
    }

    @Override // X.VZY
    public final void play() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        String str = null;
        if (c80029Vaz != null) {
            c80029Vaz.LJIIIZ(null);
        }
        if (this.LIZIZ == null) {
            V1L v1l = this.LJIIL;
            if (v1l != null) {
                str = v1l.getPlayUrl();
            } else {
                InterfaceC79968Va0 interfaceC79968Va0 = this.LJIIJJI;
                if (interfaceC79968Va0 != null) {
                    str = interfaceC79968Va0.getId();
                }
            }
            this.LJI.LIZIZ(-6, -1, this.LJFF.getDesc(), "player not attach or already be detached", str, this.LJIILJJIL);
        }
        if (this.LJIIL == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", String.valueOf(-4));
            jSONObject.put("playerType", this.LJFF.getDesc());
            jSONObject.put("autoPlay", String.valueOf(this.LJIILJJIL));
            jSONObject.put("message", "src is empty");
            jSONObject.put("src", "");
            jSONObject.put("playStatus", "-1");
            this.LJI.LIZ(jSONObject);
            J7Z.LIZIZ("AUDIO_MONITOR_TAG", "eventName: x_audio_error, error msg :src is empty");
        }
    }

    @Override // X.VZY
    public final void stop() {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            c80029Vaz.LJII(null);
        }
    }

    public static EnumC79958VZq LIZIZ(EnumC79954VZm enumC79954VZm) {
        if (enumC79954VZm != null) {
            int i = C79951VZj.LIZJ[enumC79954VZm.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EnumC79958VZq.PLAYBACK_STATE_ERROR;
                            }
                        } else {
                            return EnumC79958VZq.PLAYBACK_STATE_STOPPED;
                        }
                    } else {
                        return EnumC79958VZq.PLAYBACK_STATE_PAUSED;
                    }
                } else {
                    return EnumC79958VZq.PLAYBACK_STATE_PLAYING;
                }
            } else {
                return EnumC79958VZq.PLAYBACK_STATE_START;
            }
        }
        return EnumC79958VZq.PLAYBACK_STATE_STOPPED;
    }

    @Override // X.VZY
    public final void LIZ(int i) {
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            c80029Vaz.LJIILIIL(i, null);
        }
    }

    @Override // X.VZY
    public final void LJI(String listJsonStr) {
        InterfaceC79968Va0 interfaceC79968Va0;
        C80029Vaz c80029Vaz;
        o.LJIIJ(listJsonStr, "listJsonStr");
        XAudioList xAudioList = (XAudioList) LIZJ(listJsonStr, XAudioList.class);
        if (xAudioList != null) {
            interfaceC79968Va0 = xAudioList.toPlaylist();
        } else {
            interfaceC79968Va0 = null;
        }
        this.LJIIJJI = interfaceC79968Va0;
        if (interfaceC79968Va0 != null && (c80029Vaz = this.LIZIZ) != null) {
            c80029Vaz.LJJIJIL(interfaceC79968Va0);
        }
    }

    @Override // X.VZY
    public final void LJIIIZ(boolean z) {
        this.LJIILLIIL = z;
        LIZLLL();
    }

    @Override // X.VZY
    public final void LJIIJJI(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // X.VZY
    public final void LJIIL(String pluginsJsonStr) {
        o.LJIIJ(pluginsJsonStr, "pluginsJsonStr");
        Type type = new VKH().getType();
        o.LJFF(type, "object : TypeToken<List<String?>>() {}.type");
        this.LJ = (List) LIZJ(pluginsJsonStr, type);
        LJIJI();
    }

    @Override // X.VZY
    public final void LJIILIIL(String srcJsonStr) {
        o.LJIIJ(srcJsonStr, "srcJsonStr");
        this.LJIIL = (V1L) LIZJ(srcJsonStr, XAudioSrc.class);
        LJIJJ();
    }

    @Override // X.VZY
    public final void LJIILJJIL(EnumC79950VZi type) {
        J7O hg3;
        o.LJIIJ(type, "type");
        this.LJFF = type;
        C80029Vaz c80029Vaz = this.LIZIZ;
        if (c80029Vaz != null) {
            int i = C79951VZj.LIZIZ[type.ordinal()];
            if (i != 1 && i != 2) {
                hg3 = new J7I();
            } else {
                hg3 = new HG3();
            }
            c80029Vaz.LJJIJIIJIL(hg3);
        }
    }

    @Override // X.VZY
    public final void LJIILL(EnumC79942VZa mode) {
        EnumC79963VZv enumC79963VZv;
        C80029Vaz c80029Vaz;
        o.LJIIJ(mode, "mode");
        int i = C79951VZj.LIZ[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    enumC79963VZv = EnumC79963VZv.LIST_LOOP;
                } else {
                    throw new C162476Zf();
                }
            } else {
                enumC79963VZv = EnumC79963VZv.SEQUENCE;
            }
        } else {
            enumC79963VZv = EnumC79963VZv.SINGLE_LOOP;
        }
        this.LJIILIIL = enumC79963VZv;
        if (enumC79963VZv != null && (c80029Vaz = this.LIZIZ) != null) {
            c80029Vaz.LJJIJIIJI(enumC79963VZv);
        }
    }

    @Override // X.VZY
    public final void LJIILLIIL(boolean z) {
        this.LJIILL = z;
        LJIJ();
    }

    @Override // X.VZY
    public final void LJIIZILJ(InterfaceC79949VZh interfaceC79949VZh) {
        if (!(interfaceC79949VZh instanceof C79943VZb)) {
            interfaceC79949VZh = null;
        }
        C79943VZb c79943VZb = (C79943VZb) interfaceC79949VZh;
        if (c79943VZb != null) {
            this.LJIIJ = c79943VZb;
            C80029Vaz c80029Vaz = this.LIZIZ;
            if (c80029Vaz != null) {
                ActivityMonitorImpl activityMonitorImpl = c79943VZb.LIZ;
                if (activityMonitorImpl != null) {
                    c80029Vaz.LJJII(new C80019Vap(activityMonitorImpl));
                }
                LJIJ();
                LJIJI();
            }
        }
    }

    public final <T> T LIZJ(String str, Type type) {
        try {
            return (T) ((Gson) this.LJIIIZ.getValue()).LJII(str, type);
        } catch (Throwable unused) {
            this.LJI.LIZIZ(-7, -1, this.LJFF.getDesc(), "json format error", str, this.LJIILJJIL);
            return null;
        }
    }

    public C79960VZs(Context context, VNU vnu, int i) {
        this.LJIIZILJ = context;
        this.LJI = new C79702VPu(vnu, i);
    }
}
