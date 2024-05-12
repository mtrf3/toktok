package com.bytedance.android.live.pin;

import X.B83;
import X.BZI;
import X.C15380j0;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29419Bgd;
import X.C29841BnR;
import X.C30868C9o;
import X.C31301CQf;
import X.C31359CSl;
import X.C73318Sq2;
import X.CN1;
import X.CQO;
import X.CQQ;
import X.CR6;
import X.CRD;
import X.CS5;
import X.CS6;
import X.CS7;
import X.CSG;
import X.CSH;
import X.CSK;
import X.CSN;
import X.CSU;
import X.CSV;
import X.CSY;
import X.CTR;
import X.CTT;
import X.CU5;
import X.CU6;
import X.CU7;
import X.CU8;
import X.CUX;
import X.CV5;
import X.InterfaceC30442Bx8;
import X.InterfaceC31341CRt;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.WidgetReadyEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateEnlargeSetting;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PinMessageViewModel extends ViewModel implements CSY, CSK {
    public CQQ LJLIL;
    public CSG<CQO<? extends CR6>> LJLILLLLZI;
    public CSG<CQO<? extends CR6>> LJLJI;
    public CSG<CQO<? extends CR6>> LJLJJI;
    public CSH<? extends CRD> LJLJJL;
    public final MutableLiveData<CSH<? extends CRD>> LJLJJLL;
    public final MutableLiveData LJLJL;
    public final MutableLiveData<CUX> LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final int LJLLI;
    public C31359CSl LJLLILLLL;
    public final CSU LJLLJ;
    public long LJLLL;
    public Long LJLLLL;
    public DataChannel LJLLLLLL;

    public PinMessageViewModel() {
        MutableLiveData<CSH<? extends CRD>> mutableLiveData = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData;
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLLI = LiveAutoTranslateEnlargeSetting.getValue();
        this.LJLLJ = new CSU(this);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Long l = this.LJLLLL;
        if (l != null) {
            long longValue = l.longValue();
            CS5.LIZ.getClass();
            List<CSY> list = CS5.LJI.get(longValue);
            if (list != null) {
                list.remove(this);
            }
            List<CSK> list2 = CS7.LIZIZ.get(longValue);
            if (list2 != null) {
                list2.remove(this);
            }
        }
        C31359CSl c31359CSl = this.LJLLILLLL;
        if (c31359CSl != null) {
            CV5<T> cv5 = c31359CSl.LJIIIZ;
            if (cv5 != 0) {
                cv5.dispose();
            }
            C73318Sq2 c73318Sq2 = c31359CSl.LJIIJJI;
            if (c73318Sq2 != null && !c73318Sq2.LJLILLLLZI) {
                c73318Sq2.LIZLLL();
            }
            c31359CSl.LJIIJJI = null;
        }
    }

    @Override // X.CSY
    public final void CL(CS6 cs6) {
        CQQ cqq;
        Boolean bool;
        String str;
        Room room;
        Room room2;
        Room room3;
        Long l;
        Long l2;
        Long l3;
        this.LJLLL = SystemClock.uptimeMillis();
        CSG<CQO<? extends CR6>> csg = this.LJLILLLLZI;
        if (csg == null) {
            CSG<CQO<? extends CR6>> hv0 = hv0(cs6);
            this.LJLJI = hv0;
            if (hv0 != null) {
                iv0(hv0, null);
            }
        } else {
            this.LJLJI = csg;
            iv0(csg, new CU6());
        }
        this.LJLJJI = this.LJLJI;
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_pin_comment_show", 0.01d) && (cqq = this.LJLIL) != null && cqq.LJIILJJIL) {
            BZI LIZ = C28787BRn.LIZ("livesdk_pin_comment_show");
            LIZ.LJIILLIIL(this.LJLLLLLL);
            CQQ cqq2 = this.LJLIL;
            if (cqq2 != null) {
                bool = Boolean.valueOf(cqq2.LJIIZILJ);
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str, "is_extended_comment_filed");
            User user = cs6.LIZIZ;
            if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                LIZ.LJIJJ("pass", "use_status");
            }
            DataChannel dataChannel = this.LJLLLLLL;
            if (dataChannel != null) {
                room = (Room) dataChannel.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            LIZ.LJIJJ(C29841BnR.LIZIZ(room, this.LJLLLLLL), "admin_type");
            DataChannel dataChannel2 = this.LJLLLLLL;
            if (dataChannel2 != null) {
                room2 = (Room) dataChannel2.kv0(RoomChannel.class);
            } else {
                room2 = null;
            }
            LIZ.LJIJJ(C29841BnR.LIZ(cs6.LIZIZ, room2), "pin_user");
            DataChannel dataChannel3 = this.LJLLLLLL;
            if (dataChannel3 != null) {
                room3 = (Room) dataChannel3.kv0(RoomChannel.class);
            } else {
                room3 = null;
            }
            CS5 cs5 = CS5.LIZ;
            CR6 cr6 = cs6.LJFF;
            cs5.getClass();
            LIZ.LJIJJ(C29841BnR.LIZ(CS5.LIZLLL(cr6), room3), "msg_sent_user");
            User LIZLLL = CS5.LIZLLL(cs6.LJFF);
            if (LIZLLL != null) {
                l = Long.valueOf(LIZLLL.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "msg_sent_user_id");
            PinMessage pinMessage = cs6.LJI;
            if (pinMessage != null) {
                l2 = Long.valueOf(pinMessage.pinId);
            } else {
                l2 = null;
            }
            LIZ.LJIJJ(l2, "pin_id");
            PinMessage pinMessage2 = cs6.LJI;
            if (pinMessage2 != null) {
                l3 = Long.valueOf(pinMessage2.getMessageId());
            } else {
                l3 = null;
            }
            LIZ.LJIJJ(l3, "pin_msg_id");
            LIZ.LJJIIJZLJL();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.CSY
    public final void UO(CS6 cs6) {
        Boolean bool;
        String str;
        Room room;
        Room room2;
        Room room3;
        Long l;
        CSG<CQO<? extends CR6>> hv0 = hv0(cs6);
        if (hv0 != null) {
            this.LJLILLLLZI = hv0;
            this.LJLJJI = hv0;
            CQQ cqq = this.LJLIL;
            if (cqq != null && cqq.LJIILJJIL && LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_pin_comment_show", 0.01d)) {
                BZI LIZ = C28787BRn.LIZ("livesdk_pin_comment_show");
                LIZ.LJIILLIIL(this.LJLLLLLL);
                CQQ cqq2 = this.LJLIL;
                if (cqq2 != null) {
                    bool = Boolean.valueOf(cqq2.LJIIZILJ);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ.LJIJJ(str, "is_extended_comment_filed");
                DataChannel dataChannel = this.LJLLLLLL;
                if (dataChannel != null) {
                    room = (Room) dataChannel.kv0(RoomChannel.class);
                } else {
                    room = null;
                }
                LIZ.LJIJJ(C29841BnR.LIZIZ(room, this.LJLLLLLL), "admin_type");
                LIZ.LJIJJ("under_review", "use_status");
                DataChannel dataChannel2 = this.LJLLLLLL;
                if (dataChannel2 != null) {
                    room2 = (Room) dataChannel2.kv0(RoomChannel.class);
                } else {
                    room2 = null;
                }
                LIZ.LJIJJ(C29841BnR.LIZ(cs6.LIZIZ, room2), "pin_user");
                DataChannel dataChannel3 = this.LJLLLLLL;
                if (dataChannel3 != null) {
                    room3 = (Room) dataChannel3.kv0(RoomChannel.class);
                } else {
                    room3 = null;
                }
                CS5 cs5 = CS5.LIZ;
                CR6 cr6 = cs6.LJFF;
                cs5.getClass();
                LIZ.LJIJJ(C29841BnR.LIZ(CS5.LIZLLL(cr6), room3), "msg_sent_user");
                User LIZLLL = CS5.LIZLLL(cs6.LJFF);
                if (LIZLLL != null) {
                    l = Long.valueOf(LIZLLL.getId());
                } else {
                    l = null;
                }
                LIZ.LJIJJ(l, "msg_sent_user_id");
                LIZ.LJJIIJZLJL();
            }
            iv0(hv0, null);
        }
    }

    @Override // X.CSY
    public final void UT(CS6 cs6) {
        CSG<CQO<? extends CR6>> csg = this.LJLJI;
        if (csg != null && this.LJLIL != null && o.LJ(csg.LJIIIZ, cs6)) {
            csg.LJFF = false;
            if (this.LJLILLLLZI == null) {
                iv0(csg, null);
            }
        }
    }

    @Override // X.CSK
    public final void ci0(CUX cux) {
        this.LJLJLJ.setValue(cux);
    }

    public final boolean gv0(CRD model) {
        CQO<? extends CR6> cqo;
        CQO<? extends CR6> cqo2;
        o.LJIIIZ(model, "model");
        CSG<CQO<? extends CR6>> csg = this.LJLILLLLZI;
        CRD crd = null;
        if (csg != null) {
            cqo = csg.LJIIJ;
        } else {
            cqo = null;
        }
        if (!o.LJ(model, cqo)) {
            CSG<CQO<? extends CR6>> csg2 = this.LJLJI;
            if (csg2 != null) {
                cqo2 = csg2.LJIIJ;
            } else {
                cqo2 = null;
            }
            if (!o.LJ(model, cqo2)) {
                CSH<? extends CRD> csh = this.LJLJJL;
                if (csh != null) {
                    crd = csh.LIZ();
                }
                if (!o.LJ(model, crd)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final CSG<CQO<? extends CR6>> hv0(CS6 cs6) {
        CRD crd;
        CQO cqo;
        CQQ cqq = this.LJLIL;
        if (cqq == null) {
            return null;
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        if (iPublicScreenService != null) {
            crd = iPublicScreenService.b5(cs6.LJFF);
        } else {
            crd = null;
        }
        if (!(crd instanceof CQO) || (cqo = (CQO) crd) == null) {
            return null;
        }
        cqo.LJIJJLI(cqq);
        C31301CQf c31301CQf = cqo.LJIILL;
        c31301CQf.LIZ = false;
        c31301CQf.LIZIZ = true;
        c31301CQf.LIZJ = cs6;
        cqo.LIZLLL = false;
        return new CSG<>(cs6, cqo);
    }

    @Override // X.CSY
    public final void iB(CS6 cs6) {
        CSG<CQO<? extends CR6>> csg = this.LJLILLLLZI;
        if (csg != null && o.LJ(csg.LJIIIZ, cs6)) {
            iv0(csg, new CU6());
            return;
        }
        CSG<CQO<? extends CR6>> csg2 = this.LJLJI;
        if (csg2 != null && o.LJ(csg2.LJIIIZ, cs6)) {
            iv0(csg2, new CU6());
        }
    }

    public final void kv0(CRD model) {
        CRD crd;
        CQO<? extends CR6> cqo;
        CSG<CQO<? extends CR6>> csg;
        o.LJIIIZ(model, "model");
        Long l = this.LJLLLL;
        if (l != null) {
            l.longValue();
            CSH<? extends CRD> csh = this.LJLJJL;
            if (csh != null) {
                crd = csh.LIZ();
            } else {
                crd = null;
            }
            if (o.LJ(crd, model)) {
                CSH<? extends CRD> csh2 = this.LJLJJL;
                if (csh2 != null) {
                    csh2.LIZIZ(model);
                    iv0(csh2, null);
                    return;
                }
                return;
            }
            CSG<CQO<? extends CR6>> csg2 = this.LJLJJI;
            if (csg2 != null) {
                cqo = csg2.LJIIJ;
            } else {
                cqo = null;
            }
            if (!o.LJ(cqo, model) || (csg = this.LJLJJI) == null) {
                return;
            }
            csg.LJIIJ = (CQO) model;
            iv0(csg, null);
        }
    }

    @Override // X.CSY
    public final void lL(CS6 cs6) {
        Long l;
        Long l2;
        CSG<CQO<? extends CR6>> csg = this.LJLJI;
        if (csg != null) {
            PinMessage pinMessage = csg.LJIIIZ.LJI;
            if (pinMessage != null) {
                l = Long.valueOf(pinMessage.pinId);
            } else {
                l = null;
            }
            PinMessage pinMessage2 = cs6.LJI;
            if (pinMessage2 != null) {
                l2 = Long.valueOf(pinMessage2.pinId);
            } else {
                l2 = null;
            }
            if (o.LJ(l, l2)) {
                csg.LJFF = true;
                if (this.LJLILLLLZI == null) {
                    iv0(csg, null);
                }
            }
        }
    }

    @Override // X.CSY
    public final void u30(CS6 cs6) {
        Boolean bool;
        Boolean bool2;
        String str;
        Room room;
        Room room2;
        Long l;
        CSG<CQO<? extends CR6>> csg;
        CQQ cqq = this.LJLIL;
        if (cqq != null) {
            bool = Boolean.valueOf(cqq.LJIILJJIL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.nnd));
        }
        CSG<CQO<? extends CR6>> csg2 = this.LJLJI;
        if (csg2 != null) {
            if (csg2.LJIIIZ.LJII != 0) {
                this.LJLJJI = csg2;
                csg2.LIZLLL = 0;
                csg2.LIZJ = true;
                iv0(csg2, null);
            } else {
                CSG<CQO<? extends CR6>> csg3 = this.LJLILLLLZI;
                if (csg3 != null) {
                    csg3.LJIIJJI = true;
                    this.LJLJJI = null;
                    iv0(csg3, null);
                }
            }
        }
        if (this.LJLJI == null && (csg = this.LJLILLLLZI) != null) {
            csg.LJIIJJI = true;
            this.LJLJJI = null;
            iv0(csg, null);
        }
        CQQ cqq2 = this.LJLIL;
        if (cqq2 != null && cqq2.LJIILJJIL && cs6.LIZLLL) {
            BZI LIZ = C28787BRn.LIZ("livesdk_pin_comment_review_fail");
            LIZ.LJIILLIIL(this.LJLLLLLL);
            CQQ cqq3 = this.LJLIL;
            if (cqq3 != null) {
                bool2 = Boolean.valueOf(cqq3.LJIIZILJ);
            } else {
                bool2 = null;
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str, "is_extended_comment_filed");
            DataChannel dataChannel = this.LJLLLLLL;
            if (dataChannel != null) {
                room = (Room) dataChannel.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            LIZ.LJIJJ(C29841BnR.LIZ(cs6.LIZIZ, room), "pin_user");
            DataChannel dataChannel2 = this.LJLLLLLL;
            if (dataChannel2 != null) {
                room2 = (Room) dataChannel2.kv0(RoomChannel.class);
            } else {
                room2 = null;
            }
            CS5 cs5 = CS5.LIZ;
            CR6 cr6 = cs6.LJFF;
            cs5.getClass();
            LIZ.LJIJJ(C29841BnR.LIZ(CS5.LIZLLL(cr6), room2), "msg_sent_user");
            User LIZLLL = CS5.LIZLLL(cs6.LJFF);
            if (LIZLLL != null) {
                l = Long.valueOf(LIZLLL.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "msg_sent_user_id");
            LIZ.LJJIIJZLJL();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.CSY
    public final void yU(CS6 pinBizModel) {
        CSG<CQO<? extends CR6>> csg;
        PinMessage pinMessage;
        o.LJIIIZ(pinBizModel, "pinBizModel");
        PinMessage pinMessage2 = pinBizModel.LJI;
        if (pinMessage2 != null && (csg = this.LJLJJI) != null && (pinMessage = csg.LJIIIZ.LJI) != null && pinMessage.pinId == pinMessage2.pinId && pinBizModel.LJ) {
            iv0(csg, new CU5());
        }
    }

    @Override // X.CSY
    public final void Sm(CS6 pinBizModel, Object obj) {
        Boolean bool;
        Boolean bool2;
        Object obj2;
        Room room;
        Room room2;
        Long l;
        Room room3;
        Long l2;
        Long l3;
        o.LJIIIZ(pinBizModel, "pinBizModel");
        CSG<CQO<? extends CR6>> csg = this.LJLILLLLZI;
        Boolean bool3 = null;
        if (csg != null && o.LJ(csg.LJIIIZ, pinBizModel)) {
            csg.LJFF = true;
            this.LJLILLLLZI = null;
            this.LJLJJI = null;
            if (pinBizModel.LJIIIIZZ == CSN.INTERRUPT) {
                CQQ cqq = this.LJLIL;
                if (cqq != null) {
                    bool3 = Boolean.valueOf(cqq.LJIILJJIL);
                }
                if (C29306Beo.LJJIFFI(bool3)) {
                    C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.nng));
                }
            }
            iv0(csg, obj);
            return;
        }
        CSG<CQO<? extends CR6>> csg2 = this.LJLJI;
        if (csg2 != null) {
            CQQ cqq2 = this.LJLIL;
            if (cqq2 != null && cqq2.LJIILJJIL && LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_pin_comment_duration", 0.01d)) {
                BZI LIZ = C28787BRn.LIZ("livesdk_pin_comment_duration");
                LIZ.LJIILLIIL(this.LJLLLLLL);
                String str = "1";
                if (C29306Beo.LJJIFFI(Boolean.valueOf(cqq2.LJIIZILJ))) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ.LJIJJ(obj2, "is_extended_comment_filed");
                DataChannel dataChannel = this.LJLLLLLL;
                if (dataChannel != null) {
                    room = (Room) dataChannel.kv0(RoomChannel.class);
                } else {
                    room = null;
                }
                LIZ.LJIJJ(C29841BnR.LIZ(pinBizModel.LIZIZ, room), "pin_user");
                DataChannel dataChannel2 = this.LJLLLLLL;
                if (dataChannel2 != null) {
                    room2 = (Room) dataChannel2.kv0(RoomChannel.class);
                } else {
                    room2 = null;
                }
                CS5 cs5 = CS5.LIZ;
                CR6 cr6 = pinBizModel.LJFF;
                cs5.getClass();
                LIZ.LJIJJ(C29841BnR.LIZ(CS5.LIZLLL(cr6), room2), "msg_sent_user");
                User LIZLLL = CS5.LIZLLL(pinBizModel.LJFF);
                if (LIZLLL != null) {
                    l = Long.valueOf(LIZLLL.getId());
                } else {
                    l = null;
                }
                LIZ.LJIJJ(l, "msg_sent_user_id");
                DataChannel dataChannel3 = this.LJLLLLLL;
                if (dataChannel3 != null) {
                    room3 = (Room) dataChannel3.kv0(RoomChannel.class);
                } else {
                    room3 = null;
                }
                LIZ.LJIJJ(C29841BnR.LIZIZ(room3, this.LJLLLLLL), "admin_type");
                if (pinBizModel.LJIIIIZZ != CSN.TIME_OUT) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ.LJIJJ(str, "is_finish");
                LIZ.LJIJJ(Long.valueOf((SystemClock.uptimeMillis() - this.LJLLL) / 1000), "duration");
                PinMessage pinMessage = pinBizModel.LJI;
                if (pinMessage != null) {
                    l2 = Long.valueOf(pinMessage.pinId);
                } else {
                    l2 = null;
                }
                LIZ.LJIJJ(l2, "pin_id");
                PinMessage pinMessage2 = pinBizModel.LJI;
                if (pinMessage2 != null) {
                    l3 = Long.valueOf(pinMessage2.getMessageId());
                } else {
                    l3 = null;
                }
                LIZ.LJIJJ(l3, "pin_msg_id");
                LIZ.LJJIIJZLJL();
            }
            if (o.LJ(csg2.LJIIIZ, pinBizModel)) {
                csg2.LJFF = true;
                if (pinBizModel.LJIIIIZZ == CSN.INTERRUPT) {
                    CQQ cqq3 = this.LJLIL;
                    if (cqq3 != null) {
                        bool = Boolean.valueOf(cqq3.LJIILJJIL);
                    } else {
                        bool = null;
                    }
                    if (C29306Beo.LJJIFFI(bool)) {
                        CQQ cqq4 = this.LJLIL;
                        if (cqq4 != null) {
                            bool2 = Boolean.valueOf(cqq4.LJFF);
                        } else {
                            bool2 = null;
                        }
                        if (C29306Beo.LJJIFFI(bool2)) {
                            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.nng));
                        }
                    }
                }
                this.LJLJJI = null;
                this.LJLJI = null;
                if (this.LJLILLLLZI == null) {
                    iv0(csg2, obj);
                }
            }
        }
    }

    @Override // X.CSK
    public final void ie(CSH csh, CU7 cu7) {
        InterfaceC31341CRt interfaceC31341CRt;
        CQQ cqq = this.LJLIL;
        if (cqq != null) {
            CRD LIZ = csh.LIZ();
            if ((LIZ instanceof InterfaceC31341CRt) && (interfaceC31341CRt = (InterfaceC31341CRt) LIZ) != null) {
                interfaceC31341CRt.LJIJJLI(cqq);
            }
        }
        this.LJLJJL = csh;
        iv0(csh, cu7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iv0(CSH<? extends CRD> csh, Object obj) {
        C31359CSl c31359CSl;
        CQO cqo;
        boolean booleanValue;
        boolean booleanValue2;
        CQQ cqq = this.LJLIL;
        if (cqq != null) {
            if (!cqq.LJFF) {
                Boolean LIZJ = InterfaceC30442Bx8.u0.LIZJ();
                o.LJIIIIZZ(LIZJ, "{\n                LivePl…IENCE.value\n            }");
                booleanValue = LIZJ.booleanValue();
            } else {
                Boolean LIZJ2 = InterfaceC30442Bx8.x0.LIZJ();
                o.LJIIIIZZ(LIZJ2, "{\n                LivePl…NCHOR.value\n            }");
                booleanValue = LIZJ2.booleanValue();
            }
            this.LJLJLLL = booleanValue;
            if (cqq.LJFF) {
                Boolean LIZJ3 = InterfaceC30442Bx8.z0.LIZJ();
                o.LJIIIIZZ(LIZJ3, "{\n                LivePl…HANGE.value\n            }");
                booleanValue2 = LIZJ3.booleanValue();
            } else {
                Boolean LIZJ4 = InterfaceC30442Bx8.w0.LIZJ();
                o.LJIIIIZZ(LIZJ4, "{\n                LivePl…HANGE.value\n            }");
                booleanValue2 = LIZJ4.booleanValue();
            }
            this.LJLL = booleanValue2;
        }
        if (this.LJLLI != 0 && ((this.LJLJLLL || !this.LJLL) && (c31359CSl = this.LJLLILLLL) != null)) {
            CRD LIZ = csh.LIZ();
            if ((LIZ instanceof CQO) && (cqo = (CQO) LIZ) != 0) {
                if (cqo instanceof CTT) {
                    CTT ctt = (CTT) cqo;
                    if (ctt.LJJJJLL() && !(csh instanceof CTR)) {
                        return;
                    }
                    if (ctt.LJIILL()) {
                        jv0(csh, obj);
                        return;
                    }
                }
                if (c31359CSl.LJ(new CSV(csh, cqo, obj), this.LJLLJ) && !(csh instanceof CTR)) {
                    return;
                }
            }
        }
        jv0(csh, obj);
    }

    public final void jv0(CSH<? extends CRD> pinnedPublicScreenMessageModel, Object obj) {
        CQQ cqq;
        Boolean guide;
        C31359CSl c31359CSl;
        long j;
        o.LJIIIZ(pinnedPublicScreenMessageModel, "pinnedPublicScreenMessageModel");
        if (this.LJLLI == 1 && (cqq = this.LJLIL) != null && cqq.LIZLLL) {
            CRD LIZ = pinnedPublicScreenMessageModel.LIZ();
            if (LIZ instanceof CQO) {
                if (cqq.LJFF) {
                    guide = InterfaceC30442Bx8.y0.LIZJ();
                } else {
                    guide = InterfaceC30442Bx8.v0.LIZJ();
                }
                if (this.LJLLI != 0) {
                    o.LJIIIIZZ(guide, "guide");
                    if (guide.booleanValue() && (c31359CSl = this.LJLLILLLL) != null && c31359CSl.LJI(pinnedPublicScreenMessageModel.LJFF, (CQO) LIZ)) {
                        if (cqq.LJFF) {
                            InterfaceC30442Bx8.y0.LIZ(Boolean.FALSE);
                        } else {
                            InterfaceC30442Bx8.v0.LIZ(Boolean.FALSE);
                        }
                        RoomMessage roomMessage = new RoomMessage();
                        CommonMessageData commonMessageData = new CommonMessageData();
                        commonMessageData.roomId = cqq.LJIIJJI;
                        commonMessageData.showMsg = true;
                        roomMessage.baseMessage = commonMessageData;
                        C29419Bgd c29419Bgd = new C29419Bgd(roomMessage);
                        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
                        if (iPublicScreenService != null) {
                            Long l = this.LJLLLL;
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            iPublicScreenService.F00(j, c29419Bgd);
                        } else {
                            DataChannel dataChannel = this.LJLLLLLL;
                            if (dataChannel != null) {
                                dataChannel.mv0(WidgetReadyEvent.class, this, new AqS136S0200000_5(this, c29419Bgd, 59));
                            }
                        }
                    }
                }
            }
        }
        pinnedPublicScreenMessageModel.LIZIZ = obj;
        this.LJLJJLL.setValue(pinnedPublicScreenMessageModel);
    }

    @Override // X.CSK
    public final void lY(CSH<? extends CRD> csh, Object obj) {
        iv0(csh, obj);
    }

    @Override // X.CSK
    public final void lc0(CSH pinnedModel, CU8 cu8) {
        o.LJIIIZ(pinnedModel, "pinnedModel");
        iv0(pinnedModel, cu8);
    }
}
