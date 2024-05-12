package X;

import android.util.Pair;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttve.nativePort.TEEffectInterface;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.algorithm.VEBaseAlgorithmParam;
import com.ss.android.vesdk.effect.IEffect;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WzS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C84094WzS implements IEffect, MessageCenter.Listener {
    public static final String LJLLI = C16880lQ.LJLLJ(C84094WzS.class);
    public static final java.util.Map<String, Class> LJLLILLLL;
    public final TEEffectInterface LJLIL;
    public MessageCenter.Listener LJLILLLLZI;
    public List<InterfaceC84042Wyc> LJLJI;
    public final java.util.Map<Integer, Integer[]> LJLJJI;
    public final java.util.Set<Integer> LJLJJL;
    public final java.util.Map<Integer, Pair<VEBaseAlgorithmParam, Integer>> LJLJJLL;
    public java.util.Map<Integer, Pair<VEBaseFilterParam, Integer>> LJLJL;
    public int[] LJLJLJ;
    public List<X0W> LJLJLLL;
    public int LJLL;

    static {
        HashMap hashMap = new HashMap();
        LJLLILLLL = hashMap;
        hashMap.put("filter in time offset", Integer.class);
    }

    public static boolean LIZIZ() {
        return C65429Pm5.LJFF("ve_enable_recorder_simply_project", false);
    }

    public final void LJFF() {
        ((CopyOnWriteArrayList) this.LJLJI).clear();
        ((HashSet) this.LJLJJL).remove(0);
        Integer[] numArr = (Integer[]) ((HashMap) this.LJLJJI).get(0);
        for (int i = 0; i < numArr.length; i++) {
            int[] iArr = this.LJLJLJ;
            int intValue = numArr[i].intValue();
            int i2 = iArr[intValue] - 1;
            iArr[intValue] = i2;
            if (i2 == 0) {
                Pair pair = (Pair) ((HashMap) this.LJLJJLL).get(numArr[i]);
                String str = LJLLI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("remove track algorithm = ");
                LIZ.append(((VEBaseAlgorithmParam) pair.first).getAlgorithmName());
                P4Q.LIZ(str, X1D.LIZIZ(LIZ));
                removeTrackAlgorithm(((Integer) pair.second).intValue());
                ((HashMap) this.LJLJJLL).remove(numArr[i]);
            }
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 0);
        obtain.setInt("flag", 0);
        this.LJLIL.callEffectInterface(obtain);
        this.LJLIL.setFaceInfoCallback(null);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void unregBachAlgorithmCallback() {
        this.LJLIL.unregBachAlgorithmCallback();
    }

    public C84094WzS(TEEffectInterface tEEffectInterface) {
        HashMap hashMap = new HashMap();
        this.LJLJJI = hashMap;
        this.LJLJJL = new HashSet();
        this.LJLJJLL = new HashMap();
        this.LJLL = 0;
        this.LJLIL = tEEffectInterface;
        hashMap.put(0, new Integer[]{0, 1, 2});
        hashMap.put(1, new Integer[]{0, 3});
        this.LJLJLJ = new int[32];
        int i = 0;
        do {
            this.LJLJLJ[i] = 0;
            i++;
        } while (i < 32);
        MessageCenter.addListener(this);
    }

    public final int LIZLLL(C84117Wzp c84117Wzp) {
        X0C x0c = c84117Wzp.LIZ;
        if (x0c == null) {
            return -100;
        }
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("processGestureEventType", x0c.LIZ.ordinal());
        switch (C84110Wzi.LIZ[x0c.LIZ.ordinal()]) {
            case 1:
            case 2:
            case 3:
                C84121Wzt c84121Wzt = (C84121Wzt) x0c;
                obtain.setFloat("x", c84121Wzt.LIZIZ);
                obtain.setFloat("y", c84121Wzt.LIZJ);
                break;
            case 4:
            case 5:
                C84124Wzw c84124Wzw = (C84124Wzw) x0c;
                obtain.setFloat("x", c84124Wzw.LIZIZ);
                obtain.setFloat("y", c84124Wzw.LIZJ);
                obtain.setInt("gestureType", c84124Wzw.LIZLLL.ordinal());
                break;
            case 6:
                C84120Wzs c84120Wzs = (C84120Wzs) x0c;
                obtain.setFloat("x", c84120Wzs.LIZIZ);
                obtain.setFloat("y", c84120Wzs.LIZJ);
                obtain.setFloat("dx", c84120Wzs.LIZLLL);
                obtain.setFloat("dy", c84120Wzs.LJ);
                obtain.setFloat("factor", c84120Wzs.LJFF);
                break;
            case 7:
                C84123Wzv c84123Wzv = (C84123Wzv) x0c;
                obtain.setFloat("scale", c84123Wzv.LIZIZ);
                obtain.setFloat("factor", c84123Wzv.LIZJ);
                break;
            case 8:
                C84122Wzu c84122Wzu = (C84122Wzu) x0c;
                obtain.setFloat("rotation", c84122Wzu.LIZIZ);
                obtain.setFloat("factor", c84122Wzu.LIZJ);
                break;
            default:
                return -100;
        }
        obtain.setInt("effectInterfaceName", 23);
        return this.LJLIL.callEffectInterface(obtain);
    }

    public final void LJ(X0O x0o) {
        int i;
        this.LJLIL.setEffectAlgorithmInfoCallback(x0o);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 10);
        obtain.setInt("FlagType", 8);
        if (x0o != null) {
            i = 1;
        } else {
            i = 0;
        }
        obtain.setInt("flag", i);
        this.LJLIL.callEffectInterface(obtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final C83791WuZ getEffectFilterTime(long j) {
        C83791WuZ c83791WuZ;
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 59);
        obtain.setLong("sticker_id", j);
        TEBundle obtain2 = TEBundle.obtain();
        if (this.LJLIL.callEffectInterfaceWithResult(obtain, obtain2) == 0) {
            c83791WuZ = new C83791WuZ();
            obtain2.getLong("beforeUpdateFilterTime");
            obtain2.getLong("updateFilterTime");
            obtain2.getLong("beforeEffectProcessTime");
            obtain2.getLong("effectProcessTime");
            obtain2.getLong("recorderDrawTime");
            obtain2.getLong("switchEffectTime");
        } else {
            c83791WuZ = null;
        }
        obtain2.recycle();
        return c83791WuZ;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void regBachAlgorithmCallback(List<C79380VDk> list) {
        this.LJLIL.regBachAlgorithmCallback(list);
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 49);
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((C79380VDk) ListProtector.get(list, i)).LIZ.ordinal();
        }
        obtain.setIntArray("CallbackTypes", iArr);
        this.LJLIL.callEffectInterface(obtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int removeTrackAlgorithm(int i) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 8);
        obtain.setInt("AlgorithmIndex", i);
        this.LJLIL.callEffectInterface(obtain);
        return 0;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int removeTrackFilter(int i) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 2);
        obtain.setInt("effectEngineType", 0);
        obtain.setInt("FilterIndex", i);
        return this.LJLIL.callEffectInterface(obtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void setARCoreParam(VEARCoreParam vEARCoreParam) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("isEnableARCore", vEARCoreParam.isEnableARCore());
        obtain.setInt("effectInterfaceName", 48);
        this.LJLIL.callEffectInterface(obtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void enableEffectWithCameraFacing(boolean z, int i) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 23);
        obtain.setInt("effectEngineType", 0);
        obtain.setBool("enableEffectWithCameraFacing", z);
        obtain.setInt("cameraFacing", i);
        this.LJLIL.callEffectInterface(obtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int updateTrackAlgorithmParam(int i, VEBaseAlgorithmParam vEBaseAlgorithmParam) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 9);
        obtain.setInt("AlgorithmIndex", i);
        TEBundle LJ = C84093WzR.LJ(vEBaseAlgorithmParam);
        if (LJ != null) {
            obtain.setHandle("AlgorithmParam", LJ.getHandle());
        }
        this.LJLIL.callEffectInterface(obtain);
        if (LJ != null) {
            LJ.recycle();
            return 0;
        }
        return 0;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 4);
        obtain.setInt("effectEngineType", 0);
        obtain.setInt("FilterIndex", i);
        TEBundle LJFF = C84093WzR.LJFF(vEBaseFilterParam);
        if (LJFF != null) {
            obtain.setHandle("FitlerParam", LJFF.getHandle());
        }
        int callEffectInterface = this.LJLIL.callEffectInterface(obtain);
        if (LJFF != null) {
            LJFF.recycle();
        }
        return callEffectInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.vesdk.effect.IEffect
    public final <T> int setFilterParam(int i, String str, T t) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("FilterIndex", i);
        obtain.setInt("effectInterfaceName", 6);
        obtain.setInt("effectEngineType", 0);
        TEBundle obtain2 = TEBundle.obtain();
        if ("filter in time offset".equals(str)) {
            obtain2.setInt(str, ((Integer) t).intValue() * 1000);
        }
        obtain.setHandle("FitlerParam", obtain2.getHandle());
        int callEffectInterface = this.LJLIL.callEffectInterface(obtain);
        obtain2.recycle();
        return callEffectInterface;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int updateTrackFilterTime(int i, int i2, int i3) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 3);
        obtain.setInt("effectEngineType", 0);
        obtain.setInt("FilterIndex", i);
        obtain.setInt("SequenceIn", i2);
        obtain.setInt("SequenceOut", i3);
        return this.LJLIL.callEffectInterface(obtain);
    }

    public final void LIZ(VEBaseAlgorithmParam vEBaseAlgorithmParam, int i, int i2, int i3) {
        Pair pair = new Pair(vEBaseAlgorithmParam, Integer.valueOf(addTrackAlgorithm(0, 0, vEBaseAlgorithmParam, i, i2)));
        ((HashMap) this.LJLJJLL).put(Integer.valueOf(i3), pair);
        String str = LJLLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add algorithm: ");
        LIZ.append(vEBaseAlgorithmParam.getAlgorithmName());
        P4Q.LIZ(str, X1D.LIZIZ(LIZ));
    }

    public final void LIZJ(int i, int i2, int i3, String str) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 32);
        obtain.setInt("messageType", i);
        obtain.setInt("arg1", i2);
        obtain.setInt("arg2", i3);
        obtain.setString("arg3", str);
        this.LJLIL.callEffectInterface(obtain);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 17) {
            LIZJ(i, i2, i3, str);
        }
        MessageCenter.Listener listener = this.LJLILLLLZI;
        if (listener != null) {
            listener.onMessageReceived(i, i2, i3, str);
        }
        if (i == 58 || i == 72) {
            LIZJ(i, i2, i3, str);
        }
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void sendEffectMsg(int i, long j, long j2, byte[] bArr) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 50);
        obtain.setInt("MsgID", i);
        obtain.setLong("ARG1", j);
        obtain.setLong("ARG2", j2);
        obtain.setLong("BufSize", bArr.length);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        obtain.setByteBuffer("ARG3", allocateDirect);
        this.LJLIL.callEffectInterface(obtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int addTrackAlgorithm(int i, int i2, VEBaseAlgorithmParam vEBaseAlgorithmParam, int i3, int i4) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 7);
        obtain.setInt("TrackType", i);
        obtain.setInt("TrackIndex", i2);
        obtain.setInt("SequenceIn", i3);
        obtain.setInt("SequenceOut", i4);
        obtain.setString("AlgorithmName", vEBaseAlgorithmParam.getAlgorithmName());
        obtain.setInt("AlgorithmType", vEBaseAlgorithmParam.getAlgorithmType());
        obtain.setBool("ForInit", vEBaseAlgorithmParam.getForInit());
        TEBundle LJ = C84093WzR.LJ(vEBaseAlgorithmParam);
        if (LJ != null) {
            obtain.setHandle("AlgorithmParam", LJ.getHandle());
        }
        int callEffectInterface = this.LJLIL.callEffectInterface(obtain);
        if (LJ != null) {
            LJ.recycle();
        }
        return callEffectInterface;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int addTrackFilter(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("effectInterfaceName", 1);
        obtain.setInt("effectEngineType", 0);
        obtain.setInt("TrackIndex", i2);
        obtain.setInt("TrackType", i);
        obtain.setString("FilterName", vEBaseFilterParam.filterName);
        obtain.setInt("SequenceIn", i3);
        obtain.setInt("SequenceOut", i4);
        obtain.setInt("FilterType", vEBaseFilterParam.filterType);
        obtain.setInt("FilterDurType", vEBaseFilterParam.filterDurationType);
        TEBundle LJFF = C84093WzR.LJFF(vEBaseFilterParam);
        if (LJFF != null) {
            obtain.setHandle("FitlerParam", LJFF.getHandle());
        }
        Pair pair = new Pair(vEBaseFilterParam, -1);
        java.util.Map<Integer, Pair<VEBaseFilterParam, Integer>> map = this.LJLJL;
        if (map != null) {
            ((HashMap) map).put(Integer.valueOf(vEBaseFilterParam.filterType), pair);
        }
        int callEffectInterface = this.LJLIL.callEffectInterface(obtain);
        if (LJFF != null) {
            LJFF.recycle();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterType", vEBaseFilterParam.filterType);
            jSONObject.put("filterIndex", callEffectInterface);
            jSONObject.put("seqIn", i3);
            jSONObject.put("seqOut", i4);
            jSONObject.put("resultCode", callEffectInterface);
            c.LIZ("vesdk_event_recorder_switch_effect", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return callEffectInterface;
    }
}
