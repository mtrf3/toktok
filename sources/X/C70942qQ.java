package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.sink.ServerInfo;
import com.byted.cast.common.source.IPlayerListener;
import com.byted.cast.common.source.IServerListener;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.casting.manager.core.TTHttpNetImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS18S1101000_1;
import kotlin.jvm.internal.AqS65S0201000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.manager.core.CastingManager$initSDK$1$1", f = "CastingManager.kt", l = {416}, m = "invokeSuspend")
/* renamed from: X.2qQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70942qQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71052qb LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70942qQ(C71052qb c71052qb, InterfaceC67352kd<? super C70942qQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71052qb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70942qQ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C90442ZeY LJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            try {
                Config.Builder builder = new Config.Builder();
                builder.setAppId(String.valueOf(EF7.LJIIIZ));
                builder.setDeviceId(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
                builder.setServiceName("TikTok");
                builder.setProjectId("09c589eb-7c7d-4e9b-9dd7-f39c01b94d27");
                builder.setLocalProtocols("ChromeCast");
                FFL.LJIIIZ().getClass();
                String LJIILJJIL = FFL.LJIILJJIL(31744, "chrome_cast_id", "627BD71E", true);
                o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…IdExperiment::class.java)");
                builder.setChromeCastId(LJIILJJIL);
                builder.setMonitor(new IMonitor() { // from class: X.2qR
                    @Override // com.byted.cast.common.api.IMonitor
                    public final void onAppLogEvent(String str, JSONObject jSONObject) {
                        ZZX.LIZ(this, str, jSONObject);
                        FMX.LJIILJJIL(str, jSONObject);
                    }
                });
                builder.enableDebug(false);
                builder.setNetAdapter(new TTHttpNetImpl());
                Config build = builder.build();
                this.LJLILLLLZI.LIZIZ = new C90459Zep();
                C90459Zep c90459Zep = this.LJLILLLLZI.LIZIZ;
                if (c90459Zep != null) {
                    Context LIZIZ = EF7.LIZIZ();
                    final C71052qb c71052qb = this.LJLILLLLZI;
                    c90459Zep.LJII(LIZIZ, build, new IInitListener() { // from class: X.2qN
                        @Override // com.byted.cast.common.config.IInitListener
                        public final void onSuccess() {
                            XKX.LIZLLL(C71052qb.this.LJFF(), null, null, new C70902qM(C71052qb.this, null), 3);
                        }

                        @Override // com.byted.cast.common.config.IInitListener
                        public final void onFail(int i2, String str, Exception exc) {
                            XKX.LIZLLL(C71052qb.this.LJFF(), null, null, new C70892qL(i2, C71052qb.this, null), 3);
                        }
                    });
                }
                final C71052qb c71052qb2 = this.LJLILLLLZI;
                C90459Zep c90459Zep2 = c71052qb2.LIZIZ;
                if (c90459Zep2 != null) {
                    c90459Zep2.LJIIIIZZ(new IBrowseListener() { // from class: X.2qP
                        @Override // com.byted.cast.common.api.IBrowseListener
                        public final /* synthetic */ void onBrowseInvalidDevice(int i2, List list) {
                            ZZR.LIZ(this, i2, list);
                        }

                        @Override // com.byted.cast.common.api.IBrowseListener
                        public final /* synthetic */ void onError(int i2, String str) {
                            ZZR.LIZIZ(this, i2, str);
                        }

                        @Override // com.byted.cast.common.api.IBrowseListener
                        public final void onBrowse(int i2, List<ServiceInfo> list) {
                            C71052qb c71052qb3 = C71052qb.this;
                            AqS65S0201000_1 aqS65S0201000_1 = new AqS65S0201000_1(i2, (int) c71052qb3, (C71052qb) list, (List<ServiceInfo>) 0);
                            c71052qb3.getClass();
                            C71052qb.LJIIL(aqS65S0201000_1);
                        }
                    });
                }
                final C71052qb c71052qb3 = this.LJLILLLLZI;
                C90459Zep c90459Zep3 = c71052qb3.LIZIZ;
                if (c90459Zep3 != null) {
                    c90459Zep3.LJIIL(new IServerListener() { // from class: X.2qV
                        @Override // com.byted.cast.common.source.IServerListener
                        public final void onStop(int i2) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("setServerListener onStop serviceId: ");
                            LIZ.append(i2);
                            C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
                        }

                        @Override // com.byted.cast.common.source.IServerListener
                        public final void onStart(int i2, ServerInfo serverInfo) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("setServerListener onStart serviceId: ");
                            LIZ.append(i2);
                            C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
                        }

                        @Override // com.byted.cast.common.source.IServerListener
                        public final void onConnect(int i2, ServiceInfo serviceInfo, int i3) {
                            C71052qb c71052qb4 = C71052qb.this;
                            AqS65S0201000_1 aqS65S0201000_1 = new AqS65S0201000_1(i2, c71052qb4, serviceInfo, 1);
                            c71052qb4.getClass();
                            C71052qb.LJIIL(aqS65S0201000_1);
                        }

                        @Override // com.byted.cast.common.source.IServerListener
                        public final void onError(int i2, int i3, int i4) {
                            C71052qb c71052qb4 = C71052qb.this;
                            C71002qW c71002qW = new C71002qW(i2, i3, i4, c71052qb4);
                            c71052qb4.getClass();
                            C71052qb.LJIIL(c71002qW);
                        }

                        @Override // com.byted.cast.common.source.IServerListener
                        public final void onDisconnect(int i2, ServiceInfo serviceInfo, int i3, int i4) {
                            C71052qb c71052qb4 = C71052qb.this;
                            C71022qY c71022qY = new C71022qY(i2, i3, i4, c71052qb4, serviceInfo);
                            c71052qb4.getClass();
                            C71052qb.LJIIL(c71022qY);
                        }
                    });
                }
                C90459Zep c90459Zep4 = this.LJLILLLLZI.LIZIZ;
                if (c90459Zep4 != null && (LJ = c90459Zep4.LJ()) != null) {
                    final C71052qb c71052qb4 = this.LJLILLLLZI;
                    LJ.LIZIZ(new IPlayerListener() { // from class: X.34H
                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onDramaList(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr) {
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final /* synthetic */ void onError(int i2, String str) {
                            C90158ZZy.LIZ(this, i2, str);
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onSeekComplete(long j) {
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onCompletion() {
                            C70922qO.LIZ("CastingManager", "addPlayerListener onCompletion");
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onLoading() {
                            C70922qO.LIZ("CastingManager", "addPlayerListener onLoading");
                            C85323Wm eventSender = C772831o.LIZ();
                            o.LJIIIZ(eventSender, "eventSender");
                            C1HQ c1hq = new C1HQ();
                            c1hq.put("loading_screen", "native_app");
                            eventSender.LIZIZ("casting_loading", c1hq);
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onPause() {
                            String str;
                            C71082qe c71082qe = C71042qa.LIZIZ;
                            if (c71082qe == null) {
                                return;
                            }
                            C34L c34l = c71082qe.LIZJ;
                            String str2 = c34l.LIZJ;
                            Aweme aweme = c34l.LIZIZ;
                            String str3 = null;
                            if (aweme != null) {
                                str = aweme.getGroupId();
                            } else {
                                str = null;
                            }
                            Aweme aweme2 = c71082qe.LIZJ.LIZIZ;
                            if (aweme2 != null) {
                                str3 = aweme2.getAuthorUid();
                            }
                            String LJIIIIZZ = c71082qe.LIZIZ.LJIIIIZZ();
                            Integer valueOf = Integer.valueOf(EF7.LJIIIZ);
                            C85323Wm LIZJ = C05040Hs.LIZJ(str2, "enterFrom", "eventSender");
                            C1HQ LIZIZ2 = C48339Iy7.LIZIZ("enter_from", str2);
                            if (str == null) {
                                str = "";
                            }
                            LIZIZ2.put("group_id", str);
                            if (str3 == null) {
                                str3 = "";
                            }
                            LIZIZ2.put("author_id", str3);
                            LIZIZ2.put("is_tt_app", String.valueOf(true));
                            LIZIZ2.put("casting_device_id", LJIIIIZZ);
                            LIZIZ2.put("app_id", "");
                            if (valueOf != null) {
                                valueOf.intValue();
                                LIZIZ2.put("app_id", valueOf.toString());
                            }
                            LIZIZ2.put("action_from", "user_click");
                            LIZJ.LIZIZ("casting_video_pause", LIZIZ2);
                            C71052qb c71052qb5 = C71052qb.this;
                            AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(c71052qb5, 40);
                            c71052qb5.getClass();
                            C71052qb.LJIIL(aqS151S0100000_1);
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onStart() {
                            C71052qb.this.getClass();
                            C71052qb c71052qb5 = C71052qb.this;
                            c71052qb5.getClass();
                            C71052qb.LJIIL(new AqS151S0100000_1(c71052qb5, 41));
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onStop() {
                            C70922qO.LIZ("CastingManager", "addPlayerListener onStop");
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onVolumeChanged(float f) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("addPlayerListener onVolumeChanged percent: ");
                            LIZ.append(f);
                            C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onDramaId(ServiceInfo serviceInfo, String str) {
                            C34J c34j;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("addPlayerListener onDramaId ");
                            LIZ.append(str);
                            C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("onDramaId id: ");
                            LIZ2.append(str);
                            C70922qO.LIZ("koko", X1D.LIZIZ(LIZ2));
                            if (str != null && (c34j = C71052qb.this.LJFF) != null) {
                                c34j.LJIL(str);
                            }
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onError(int i2, int i3) {
                            C779434c c779434c;
                            MutableLiveData<ServiceInfo> mutableLiveData;
                            ServiceInfo value;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("addPlayerListener onError what: ");
                            LIZ.append(i2);
                            C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
                            C71082qe c71082qe = C71042qa.LIZIZ;
                            if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null && (mutableLiveData = c779434c.LJIIIIZZ) != null && (value = mutableLiveData.getValue()) != null) {
                                C71052qb c71052qb5 = C71052qb.this;
                                c71052qb5.LJ(value);
                                c71052qb5.LJII();
                            }
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onInfo(int i2, int i3) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("addPlayerListener onInfo what: ");
                            LIZ.append(i2);
                            C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
                        }

                        @Override // com.byted.cast.common.source.IPlayerListener
                        public final void onPositionUpdate(long j, long j2) {
                            C71052qb c71052qb5 = C71052qb.this;
                            C34I c34i = new C34I(c71052qb5, j, j2);
                            c71052qb5.getClass();
                            C71052qb.LJIIL(c34i);
                        }
                    });
                }
                final C71052qb c71052qb5 = this.LJLILLLLZI;
                C90459Zep c90459Zep5 = c71052qb5.LIZIZ;
                if (c90459Zep5 != null) {
                    c90459Zep5.LJIILIIL(new ISinkDeviceInfoListener() { // from class: X.2qT
                        @Override // com.byted.cast.common.source.ISinkDeviceInfoListener
                        public final void onSuccess(SinkDeviceInfo sinkDeviceInfo) {
                            C71052qb c71052qb6 = C71052qb.this;
                            AqS148S0200000_1 aqS148S0200000_1 = new AqS148S0200000_1(sinkDeviceInfo, this, c71052qb6, 7);
                            c71052qb6.getClass();
                            C71052qb.LJIIL(aqS148S0200000_1);
                        }

                        @Override // com.byted.cast.common.source.ISinkDeviceInfoListener
                        public final void onFail(int i2, String str) {
                            C71052qb c71052qb6 = C71052qb.this;
                            AqS18S1101000_1 aqS18S1101000_1 = new AqS18S1101000_1(i2, str, c71052qb6, 0);
                            c71052qb6.getClass();
                            C71052qb.LJIIL(aqS18S1101000_1);
                        }
                    });
                }
            } catch (NoClassDefFoundError unused) {
                C70922qO.LIZ("CastingManager", "NoClassDefFoundError found while trying to initialize bytecast SDK! Something went wrong with the download/load of DF");
                XLM xlm = this.LJLILLLLZI.LJIIIZ;
                Boolean bool = Boolean.FALSE;
                this.LJLIL = 1;
                xlm.setValue(bool);
                if (C76800UCe.LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
