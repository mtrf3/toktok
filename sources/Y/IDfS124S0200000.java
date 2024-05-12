package Y;

import X.AJ8;
import X.AbstractC51301zq;
import X.AbstractC73672Svk;
import X.BZI;
import X.C0JV;
import X.C0JW;
import X.C0NB;
import X.C0PT;
import X.C0PX;
import X.C0YD;
import X.C14020go;
import X.C141335gf;
import X.C14460hW;
import X.C14520hc;
import X.C14540he;
import X.C16880lQ;
import X.C18210nZ;
import X.C18230nb;
import X.C1QC;
import X.C1XB;
import X.C276716t;
import X.C28787BRn;
import X.C29306Beo;
import X.C29702BlC;
import X.C32364Cn2;
import X.C34951Yt;
import X.C37931eH;
import X.C3C4;
import X.C3C5;
import X.C43191ml;
import X.C43371n3;
import X.C47261Igj;
import X.C48459J0d;
import X.C51029K0z;
import X.C61878OQg;
import X.C62705OjF;
import X.C73849Syb;
import X.C73933Szx;
import X.C81185Vtd;
import X.CCJ;
import X.EnumC12710eh;
import X.EnumC276816u;
import X.InterfaceC14010gn;
import X.InterfaceC29856Bng;
import X.InterfaceC30237Btp;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.JBR;
import X.ORY;
import X.RunnableC31065CHd;
import X.X1D;
import X.YLM;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.SensorEvent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordAddResponse;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceQRCodeFragment;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectResponse;
import com.bytedance.android.live.effect.filter.LiveFilterFragment;
import com.bytedance.android.live.effect.filter.composerfilter.LiveComposerFilterFragment;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.kyc.KYCIqaIdPhotoResult;
import com.bytedance.android.livesdk.comp.api.game.GameDualDevicePageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDfS124S0200000 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(IDfS124S0200000 iDfS124S0200000, Object obj) {
        Throwable e = (Throwable) obj;
        o.LJIIIZ(e, "e");
        C0NB.LJI("EffectHouseHelper_getUserInfoById", e);
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDfS124S0200000.l0;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke((LiveEffect) iDfS124S0200000.l1, null);
        }
    }

    public static final void accept$1(IDfS124S0200000 iDfS124S0200000, Object obj) {
        if (((YLM) obj).LIZ == 206) {
            ((LiveGoalBackgroundDialogFragment) iDfS124S0200000.l0).xl(false);
            ((View) iDfS124S0200000.l1).postDelayed(new IDRunnableS85S0100000((LiveGoalBackgroundDialogFragment) iDfS124S0200000.l0, 63), 50L);
        }
    }

    public static final void accept$10(IDfS124S0200000 iDfS124S0200000, Object obj) {
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
        Integer currentIndex = c48459J0d.LIZJ();
        o.LJIIIIZZ(currentIndex, "currentIndex");
        if (currentIndex.intValue() < ((ArrayList) ((LiveFilterFragment) iDfS124S0200000.l0).LJLIL).size()) {
            C43191ml c43191ml = ((LiveFilterFragment) iDfS124S0200000.l0).LJLJI;
            if (c43191ml != null) {
                c43191ml.LJLJJI = c48459J0d.LIZJ().intValue();
            }
            C43191ml c43191ml2 = ((LiveFilterFragment) iDfS124S0200000.l0).LJLJI;
            if (c43191ml2 != null) {
                c43191ml2.notifyDataSetChanged();
            }
            ((RunnableC31065CHd) iDfS124S0200000.l1).LJLIL(currentIndex.intValue());
            LiveFilterFragment liveFilterFragment = (LiveFilterFragment) iDfS124S0200000.l0;
            DataChannel dataChannel = liveFilterFragment.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.qv0(OnFilterSelectedEvent.class, ListProtector.get(liveFilterFragment.LJLIL, currentIndex.intValue()));
            }
            DataChannel dataChannel2 = ((LiveFilterFragment) iDfS124S0200000.l0).LJLILLLLZI;
            if (dataChannel2 != null) {
                dataChannel2.qv0(OnFilterSelectedByClickEvent.class, Boolean.FALSE);
            }
        }
    }

    public static final void accept$11(IDfS124S0200000 iDfS124S0200000, Object obj) {
        LiveComposerFilterFragment liveComposerFilterFragment;
        DataChannel dataChannel;
        LiveComposerFilterFragment liveComposerFilterFragment2 = (LiveComposerFilterFragment) iDfS124S0200000.l0;
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
        liveComposerFilterFragment2.LJLJJLL = c48459J0d.LIZJ();
        Integer currentIndex = ((LiveComposerFilterFragment) iDfS124S0200000.l0).LJLJJLL;
        o.LJIIIIZZ(currentIndex, "currentIndex");
        if (currentIndex.intValue() < ((ArrayList) ((LiveComposerFilterFragment) iDfS124S0200000.l0).LJLJJI).size()) {
            C43371n3 c43371n3 = ((LiveComposerFilterFragment) iDfS124S0200000.l0).LJLJI;
            if (c43371n3 != null) {
                Integer LIZJ = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
                c43371n3.LJLJJL = LIZJ.intValue();
            }
            C43371n3 c43371n32 = ((LiveComposerFilterFragment) iDfS124S0200000.l0).LJLJI;
            if (c43371n32 != null) {
                c43371n32.notifyDataSetChanged();
            }
            RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) iDfS124S0200000.l1;
            Integer currentIndex2 = ((LiveComposerFilterFragment) iDfS124S0200000.l0).LJLJJLL;
            o.LJIIIIZZ(currentIndex2, "currentIndex");
            runnableC31065CHd.LJLIL(currentIndex2.intValue());
            if (C29306Beo.LJIILJJIL() && (dataChannel = (liveComposerFilterFragment = (LiveComposerFilterFragment) iDfS124S0200000.l0).LJLILLLLZI) != null) {
                List<LiveEffect> list = liveComposerFilterFragment.LJLJJI;
                Integer currentIndex3 = liveComposerFilterFragment.LJLJJLL;
                o.LJIIIIZZ(currentIndex3, "currentIndex");
                dataChannel.qv0(OnFilterSelectedEvent.class, ListProtector.get(list, currentIndex3.intValue()));
            }
        }
    }

    public static final void accept$12(IDfS124S0200000 iDfS124S0200000, Object obj) {
        SensorEvent sensorEvent = (SensorEvent) iDfS124S0200000.l0;
        if (sensorEvent != null) {
            C1XB c1xb = (C1XB) iDfS124S0200000.l1;
            int type = sensorEvent.sensor.getType();
            if (type != 1) {
                if (type != 2) {
                    if (type != 10) {
                        return;
                    }
                    float[] fArr = sensorEvent.values;
                    float[] fArr2 = c1xb.LJI;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                    return;
                }
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = c1xb.LJIIIIZZ;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
                return;
            }
            float[] fArr5 = sensorEvent.values;
            float[] fArr6 = c1xb.LJII;
            System.arraycopy(fArr5, 0, fArr6, 0, fArr6.length);
        }
    }

    public static final void accept$13(IDfS124S0200000 iDfS124S0200000, Object obj) {
        if (C276716t.LIZJ()) {
            ((InterfaceC30237Btp) iDfS124S0200000.l0).setAlpha(1.0f);
            BZI LIZ = C28787BRn.LIZ("livesdk_dual_device_setting_detail");
            LIZ.LJIJJ(((C34951Yt) iDfS124S0200000.l1).LJLILLLLZI.getValue(), "anchor_id");
            LIZ.LJIJJ(Long.valueOf(((Number) ((C34951Yt) iDfS124S0200000.l1).LJLIL.getValue()).longValue()), "room_id");
            LIZ.LJIJJ("show", "action_type");
            LIZ.LJJIIJZLJL();
            return;
        }
        ((InterfaceC30237Btp) iDfS124S0200000.l0).setAlpha(0.32f);
    }

    public static final void accept$14(IDfS124S0200000 iDfS124S0200000, Object obj) {
        TextView textView = (TextView) iDfS124S0200000.l0;
        GameDualDeviceQRCodeFragment gameDualDeviceQRCodeFragment = (GameDualDeviceQRCodeFragment) iDfS124S0200000.l1;
        gameDualDeviceQRCodeFragment.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        String string = gameDualDeviceQRCodeFragment.getString(R.string.mvo);
        o.LJIIIIZZ(string, "getString(R.string.pm_ls…ndCam_actionSheet2_body1)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{gameDualDeviceQRCodeFragment.getString(R.string.mvu)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        stringBuffer.append(LLLZ);
        stringBuffer.append("\n");
        String string2 = gameDualDeviceQRCodeFragment.getString(R.string.mvp);
        o.LJIIIIZZ(string2, "getString(R.string.pm_ls…ndCam_actionSheet2_body2)");
        String LLLZ2 = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{gameDualDeviceQRCodeFragment.getString(R.string.mvv)}, 1));
        o.LJIIIIZZ(LLLZ2, "format(format, *args)");
        stringBuffer.append(LLLZ2);
        stringBuffer.append("\n");
        String string3 = gameDualDeviceQRCodeFragment.getString(R.string.mvq);
        o.LJIIIIZZ(string3, "getString(R.string.pm_ls…ndCam_actionSheet2_body3)");
        String LLLZ3 = C16880lQ.LLLZ(string3, Arrays.copyOf(new Object[]{gameDualDeviceQRCodeFragment.getString(R.string.mvw), gameDualDeviceQRCodeFragment.getString(R.string.mvx)}, 2));
        o.LJIIIIZZ(LLLZ3, "format(format, *args)");
        stringBuffer.append(LLLZ3);
        stringBuffer.append("\n");
        String string4 = gameDualDeviceQRCodeFragment.getString(R.string.mvr);
        o.LJIIIIZZ(string4, "getString(R.string.pm_ls…ndCam_actionSheet2_body4)");
        String LLLZ4 = C16880lQ.LLLZ(string4, Arrays.copyOf(new Object[]{gameDualDeviceQRCodeFragment.getString(R.string.mvy)}, 1));
        o.LJIIIIZZ(LLLZ4, "format(format, *args)");
        stringBuffer.append(LLLZ4);
        stringBuffer.append("\n");
        stringBuffer.append(gameDualDeviceQRCodeFragment.getString(R.string.mvs));
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "stringBuffer.toString()");
        textView.setText(stringBuffer2);
        C0NB.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
    }

    public static final void accept$15(IDfS124S0200000 iDfS124S0200000, Object obj) {
        String hostIp;
        final long j;
        Room room;
        C48459J0d<Integer> c48459J0d;
        boolean z = false;
        if (obj == EnumC276816u.StateConnected) {
            if (((Boolean) ((GameDualDeviceQRCodeFragment) iDfS124S0200000.l0).LJLIL.getValue()).booleanValue()) {
                c48459J0d = InterfaceC30442Bx8.i3;
            } else {
                c48459J0d = InterfaceC30442Bx8.j3;
            }
            Integer position = c48459J0d.LIZJ();
            EnumC12710eh[] values = EnumC12710eh.values();
            o.LJIIIIZZ(position, "position");
            Object LJJJJI = ORY.LJJJJI(position.intValue(), values);
            if (LJJJJI != null) {
                C276716t.LIZIZ.onNext(LJJJJI);
            }
            C276716t.LIZLLL.onNext(Boolean.valueOf(((Boolean) ((GameDualDeviceQRCodeFragment) iDfS124S0200000.l0).LJLIL.getValue()).booleanValue()));
            Context context = ((View) iDfS124S0200000.l1).getContext();
            if (context != null) {
                float LJ = C81185Vtd.LJ(context);
                float LIZJ = C81185Vtd.LIZJ(context);
                if (LJ > 0.0f && LIZJ > 0.0f) {
                    float f = LIZJ / LJ;
                    C73849Syb<Boolean> c73849Syb = C276716t.LJ;
                    if (f < 1.7777778f) {
                        z = true;
                    }
                    c73849Syb.onNext(Boolean.valueOf(z));
                }
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((GameDualDeviceQRCodeFragment) iDfS124S0200000.l0);
            if (LJIILIIL != null) {
                LJIILIIL.qv0(GameDualDevicePageChannel.class, 3);
                return;
            }
            return;
        }
        C73849Syb<EnumC276816u> c73849Syb2 = C276716t.LIZJ;
        if (c73849Syb2.LJJZZIII() == EnumC276816u.StateIdle || c73849Syb2.LJJZZIII() == EnumC276816u.StateServerStop) {
            return;
        }
        C0JW.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        String hostAddress = nextElement.getHostAddress();
                        hostAddress.toString();
                        arrayList.add(hostAddress);
                    }
                }
            }
        } catch (SocketException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!arrayList.isEmpty()) {
            hostIp = (String) ListProtector.get(arrayList, 0);
        } else {
            hostIp = "0.0.0.0";
        }
        int i = C276716t.LJI;
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL((GameDualDeviceQRCodeFragment) iDfS124S0200000.l0);
        if (LJIILIIL2 != null && (room = (Room) LJIILIIL2.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C0JW c0jw = C0JW.LIZ;
        String value = GameDualDeviceSchema.INSTANCE.getValue();
        c0jw.getClass();
        o.LJIIIZ(hostIp, "hostIp");
        if (TextUtils.isEmpty(value)) {
            value = "snssdk1180://dual_device?";
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(value);
        c32364Cn2.LIZJ("source_ip", hostIp);
        c32364Cn2.LIZ(i, "source_port");
        c32364Cn2.LIZIZ(j, "room_id");
        c32364Cn2.LIZ(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, "video_w");
        c32364Cn2.LIZ(480, "video_h");
        c32364Cn2.LIZ(1, "ver");
        String LIZLLL = c32364Cn2.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "qrCodeUrl.build()");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("qrCodeString = ");
        LIZ.append(LIZLLL);
        C0NB.LJIIIZ("GameDualDeviceQRCodeFragment", X1D.LIZIZ(LIZ));
        InterfaceC29856Bng interfaceC29856Bng = (InterfaceC29856Bng) AbstractC73672Svk.LJJIJIL(LIZLLL).LJJIJL(new IDhS93S0100000((GameDualDeviceQRCodeFragment) iDfS124S0200000.l0, 5)).LJII(new C62705OjF()).LIZJ(C73933Szx.LIZLLL((GameDualDeviceQRCodeFragment) iDfS124S0200000.l0));
        final GameDualDeviceQRCodeFragment gameDualDeviceQRCodeFragment = (GameDualDeviceQRCodeFragment) iDfS124S0200000.l0;
        interfaceC29856Bng.LIZJ(new InterfaceC64592gB() { // from class: X.1Zt
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj2) {
                Bitmap bitmap = (Bitmap) obj2;
                if (bitmap == null) {
                    return;
                }
                ImageView imageView = (ImageView) GameDualDeviceQRCodeFragment.this.LJLILLLLZI.getValue();
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                String roomId = String.valueOf(j);
                o.LJIIIZ(roomId, "roomId");
                BZI LIZ2 = C28787BRn.LIZ("livesdk_dual_device_qr_code_show");
                LIZ2.LJIJJ(Long.valueOf(C0JV.LIZ()), "anchor_id");
                LIZ2.LJIJJ(roomId, "room_id");
                LIZ2.LJJIIJZLJL();
            }
        }, new InterfaceC64592gB() { // from class: X.1Zu
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj2) {
                C0NB.LJ("GameDualDeviceQRCodeFragment", android.util.Log.getStackTraceString((Throwable) obj2));
            }
        });
        if (arrayList.isEmpty()) {
            C0JV.LJFF(j, "init_sdk", 2003, null, "ip_empty", 8);
        }
        if (i > 0) {
            return;
        }
        C0JV.LJFF(j, "init_sdk", 2003, null, "port_empty", 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(IDfS124S0200000 iDfS124S0200000, Object obj) {
        List list;
        SoundEffectResponse soundEffectResponse = (SoundEffectResponse) ((BaseResponse) obj).data;
        if (soundEffectResponse == null || (list = soundEffectResponse.effectList) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (!list.isEmpty()) {
            ((C37931eH) iDfS124S0200000.l0).LIZIZ().clear();
            ((C37931eH) iDfS124S0200000.l0).LIZIZ().addAll(list);
            ((C37931eH) iDfS124S0200000.l0).LIZLLL();
        } else {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDfS124S0200000.l1;
            final String str = "empty data from remote";
            C3C4 LIZ = C141335gf.LIZ(new Exception(str) { // from class: X.10o
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(str);
                    o.LJIIIZ(str, "msg");
                }
            });
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd.resumeWith(LIZ);
        }
        InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) iDfS124S0200000.l1;
        List LJJIJ = C47261Igj.LJJIJ(new C1QC("sound_effect", "sound_effect", list, null, 56));
        C3C5.m7constructorimpl(LJJIJ);
        interfaceC67352kd2.resumeWith(LJJIJ);
    }

    public static final void accept$2(IDfS124S0200000 iDfS124S0200000, Object obj) {
        List fileByteArrays = (List) obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) iDfS124S0200000.l0).iterator();
        while (it.hasNext()) {
            String uri = ((Uri) it.next()).toString();
            o.LJIIIIZZ(uri, "it.toString()");
            arrayList.add(uri);
        }
        KYCCameraActivity kYCCameraActivity = (KYCCameraActivity) iDfS124S0200000.l1;
        o.LJIIIIZZ(fileByteArrays, "fileByteArrays");
        kYCCameraActivity.LLFZ(fileByteArrays, true);
    }

    public static final void accept$3(IDfS124S0200000 iDfS124S0200000, Object obj) {
        Boolean bool;
        KYCIqaIdPhotoResult kYCIqaIdPhotoResult = (KYCIqaIdPhotoResult) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upLoadIaqVerify success, valid? : ");
        if (kYCIqaIdPhotoResult != null) {
            bool = Boolean.valueOf(kYCIqaIdPhotoResult.isValid);
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append('.');
        Logger.e("KYCCameraManager", X1D.LIZIZ(LIZ));
        if (kYCIqaIdPhotoResult != null && kYCIqaIdPhotoResult.isValid) {
            C0PT c0pt = ((C0PX) iDfS124S0200000.l0).LIZJ;
            if (c0pt != null) {
                c0pt.LIZ((byte[]) iDfS124S0200000.l1);
                return;
            }
            return;
        }
        ((C0PX) iDfS124S0200000.l0).LJ();
    }

    public static final void accept$4(IDfS124S0200000 iDfS124S0200000, Object obj) {
        AbstractC51301zq abstractC51301zq = (AbstractC51301zq) iDfS124S0200000.l0;
        C0YD c0yd = (C0YD) iDfS124S0200000.l1;
        if (abstractC51301zq.LJIIL.LJII) {
            return;
        }
        if (c0yd.LJIIIIZZ) {
            C0NB.LIZIZ("RxCacheDataSource", "called refresh, but paging not rebuild data source");
        }
        c0yd.LJIIIIZZ = true;
        abstractC51301zq.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(IDfS124S0200000 iDfS124S0200000, Object obj) {
        Integer num = ((BlockWordAddResponse) ((BaseResponse) obj).data).id;
        if (num != null) {
            BlockWord blockWord = (BlockWord) iDfS124S0200000.l0;
            C14020go c14020go = (C14020go) iDfS124S0200000.l1;
            blockWord.id = num.intValue();
            c14020go.LIZ.LIZIZ(blockWord);
            C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_add_sensitive_word");
            LIZLLL.LIZLLL("sensitive_word", blockWord.content);
            LIZLLL.LJIIIZ();
        }
    }

    public static final void accept$6(IDfS124S0200000 iDfS124S0200000, Object obj) {
        Throwable throwable = (Throwable) obj;
        InterfaceC14010gn interfaceC14010gn = ((C14020go) iDfS124S0200000.l0).LIZ;
        o.LJIIIIZZ(throwable, "throwable");
        interfaceC14010gn.LLLLZIL(throwable);
        C29702BlC LIZ = C18210nZ.LIZ("ttlive_add_sensitive_word", throwable);
        LIZ.LIZLLL("sensitive_word", ((BlockWord) iDfS124S0200000.l1).content);
        LIZ.LJIIIZ();
    }

    public static final void accept$7(IDfS124S0200000 iDfS124S0200000, Object obj) {
        ((C14020go) iDfS124S0200000.l0).LIZ.LIZ((BlockWord) iDfS124S0200000.l1);
        C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_delete_sensitive_word");
        LIZLLL.LIZLLL("sensitive_word", ((BlockWord) iDfS124S0200000.l1).content);
        LIZLLL.LJIIIZ();
    }

    public static final void accept$8(IDfS124S0200000 iDfS124S0200000, Object obj) {
        Throwable throwable = (Throwable) obj;
        InterfaceC14010gn interfaceC14010gn = ((C14020go) iDfS124S0200000.l0).LIZ;
        o.LJIIIIZZ(throwable, "throwable");
        interfaceC14010gn.LIZJ(throwable);
        C29702BlC LIZ = C18210nZ.LIZ("ttlive_delete_sensitive_word", throwable);
        LIZ.LIZLLL("sensitive_word", ((BlockWord) iDfS124S0200000.l1).content);
        LIZ.LJIIIZ();
    }

    public static final void accept$9(IDfS124S0200000 iDfS124S0200000, Object obj) {
        float f;
        Bitmap it = (Bitmap) obj;
        C14520hc c14520hc = (C14520hc) iDfS124S0200000.l0;
        C14540he c14540he = (C14540he) iDfS124S0200000.l1;
        o.LJIIIIZZ(it, "it");
        c14520hc.getClass();
        ImageView imageView = new ImageView(c14520hc.LIZJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        if (c14520hc.LIZIZ instanceof FrameLayout) {
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setX(c14540he.LIZ.LIZ.x);
        imageView.setY(c14540he.LIZ.LIZ.y);
        imageView.setImageDrawable(new BitmapDrawable(imageView.getContext().getResources(), it));
        C14520hc c14520hc2 = (C14520hc) iDfS124S0200000.l0;
        C14540he c14540he2 = (C14540he) iDfS124S0200000.l1;
        ViewGroup viewGroup = c14520hc2.LIZIZ;
        if (viewGroup != null) {
            viewGroup.addView(imageView);
        }
        imageView.setPivotX(0.5f);
        imageView.setPivotY(0.5f);
        Rect rect = new Rect();
        ViewGroup viewGroup2 = c14520hc2.LIZIZ;
        if (viewGroup2 != null) {
            viewGroup2.getGlobalVisibleRect(rect);
        }
        Path path = new Path();
        Point point = c14540he2.LIZ.LIZ;
        float f2 = point.x;
        float f3 = point.y;
        if (CCJ.LIZ(c14520hc2.LIZJ)) {
            C14460hW c14460hW = c14540he2.LIZ;
            f = (c14460hW.LIZIZ.x - rect.left) - (c14460hW.LIZLLL[0] * 0.35f);
        } else {
            C14460hW c14460hW2 = c14540he2.LIZ;
            f = (c14460hW2.LIZIZ.x - rect.left) + (c14460hW2.LIZLLL[0] * 0.35f);
        }
        C14460hW c14460hW3 = c14540he2.LIZ;
        path.moveTo(f2, f3);
        path.quadTo(f, f3, f, (c14460hW3.LIZLLL[1] * 0.35f) + (c14460hW3.LIZIZ.y - rect.top));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.X, (Property<ImageView, Float>) View.Y, path);
        ofFloat.setInterpolator(new AJ8());
        ofFloat.setDuration(400L);
        C14460hW c14460hW4 = c14540he2.LIZ;
        float f4 = ((c14460hW4.LIZLLL[0] * 1.0f) / c14460hW4.LIZJ.LIZJ.LJLILLLLZI[0]) * 0.3f;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, f4));
        AnimatorSet LIZLLL = JBR.LIZLLL(ofPropertyValuesHolder, 400L);
        LIZLLL.play(ofFloat).with(ofPropertyValuesHolder);
        LIZLLL.start();
        LIZLLL.addListener(new IDLAdapterS0S0400000(LIZLLL, c14540he2, c14520hc2, imageView, 4));
        ((ArrayList) c14520hc2.LIZLLL).add(LIZLLL);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDfS124S0200000(X.C14020go r2, com.bytedance.android.live.broadcast.api.blockword.model.BlockWord r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS124S0200000.<init>(X.0go, com.bytedance.android.live.broadcast.api.blockword.model.BlockWord, int):void");
    }

    public IDfS124S0200000(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
