package X;

import ccb.t;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAO implements InvocationHandler {
    public final WeakReference<t> LIZ;

    public VAO(t tVar) {
        this.LIZ = new WeakReference<>(tVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z;
        JSONObject LJFF;
        t tVar = this.LIZ.get();
        if (tVar == null) {
            return null;
        }
        if (method.getName().equals("updateFrameTerminatedDTS") && objArr.length >= 3) {
            ((Integer) objArr[0]).intValue();
            long longValue = ((Long) objArr[1]).longValue();
            ((Long) objArr[2]).longValue();
            tVar.LLLLLJLJLL = longValue;
        } else if (method.getName().equals("frameDTSNotify") && objArr.length >= 3) {
            int intValue = ((Integer) objArr[0]).intValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            ((Long) objArr[2]).longValue();
            if (tVar.LLLLLLJ == 1 && intValue == 9 && tVar.LLZLLIL.equals("origin")) {
                VAD vad = tVar.LJLJJI;
                if (vad.x1 == null) {
                    vad.x1 = new LinkedBlockingQueue<>(600);
                }
                if (vad.x1.remainingCapacity() == 0 && vad.x1.size() > 0) {
                    vad.x1.poll();
                }
                vad.x1.offer(Long.valueOf(longValue2));
            }
            if (intValue == 8 && tVar.LLLLLIL == 1) {
                VAD vad2 = tVar.LJLJJI;
                if (vad2.g1 < 0) {
                    vad2.g1 = longValue2;
                } else {
                    long j = tVar.LLLLLL;
                    if (longValue2 < j && (LJFF = vad2.LJFF()) != null) {
                        try {
                            LJFF.put("event_key", "timestamp_rollback").put("packet_type", "audio").put("timestamp_type", "dts").put("latest_ts", longValue2).put("previous_ts", j);
                            vad2.LJJI("live_client_monitor_log", LJFF);
                            long j2 = vad2.LLLLII;
                            if (j2 > 0) {
                                vad2.LLLLII = j2 + 1;
                            }
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                }
                tVar.LLLLLL = longValue2;
            }
        } else if (method.getName().equals("receiveBinarySei") && objArr.length >= 1) {
            ByteBuffer byteBuffer = (ByteBuffer) objArr[0];
            C39723FiR c39723FiR = tVar.D2;
            if (byteBuffer == null || byteBuffer.limit() < 4 || byteBuffer.get(0) != 65 || byteBuffer.get(1) != 76 || byteBuffer.get(2) != 71 || byteBuffer.get(3) != 79) {
                z = false;
            } else {
                z = true;
            }
            if (z && c39723FiR != null && tVar.k0 == 1) {
                c39723FiR.LIZJ(byteBuffer, 105, 0, null);
            }
        } else if (method.getName().equals("onAbrDecisionInfo") && objArr.length >= 2) {
            long longValue3 = ((Long) objArr[0]).longValue();
            String str = (String) objArr[1];
            VAD vad3 = tVar.LJLJJI;
            if (vad3.Q4 == null) {
                vad3.Q4 = new ArrayList();
                vad3.R4 = new ArrayList();
                vad3.S4 = new ArrayList();
                vad3.T4 = new ArrayList();
                vad3.U4 = new ArrayList();
                vad3.V4 = new ArrayList();
                vad3.W4 = new ArrayList();
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                ((ArrayList) vad3.Q4).add(Long.valueOf(longValue3));
                if (jSONObject.has("current_download_speed")) {
                    ((ArrayList) vad3.T4).add(Long.valueOf(jSONObject.optLong("current_download_speed")));
                }
                if (jSONObject.has("current_bitrate")) {
                    ((ArrayList) vad3.R4).add(Long.valueOf(jSONObject.optLong("current_bitrate")));
                }
                if (jSONObject.has("predict_bitrate")) {
                    ((ArrayList) vad3.S4).add(Long.valueOf(jSONObject.optLong("predict_bitrate")));
                }
                if (jSONObject.has("probe_bandwidth")) {
                    ((ArrayList) vad3.U4).add(Long.valueOf(jSONObject.optLong("probe_bandwidth")));
                }
                if (jSONObject.has("is_buffering")) {
                    if (jSONObject.optInt("is_buffering") == 1) {
                        ((ArrayList) vad3.W4).add(1);
                    } else {
                        ((ArrayList) vad3.W4).add(0);
                    }
                }
                if (jSONObject.has("buffer_len")) {
                    ((ArrayList) vad3.V4).add(Double.valueOf(jSONObject.optDouble("buffer_len")));
                }
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        } else {
            if (method.getName().equals("getStrategyParams") && objArr.length >= 1) {
                String str2 = (String) objArr[0];
                str2.getClass();
                if (!str2.equals("live_strategy_probe_bandwidth")) {
                    if (str2.equals("live_strategy_predict_bitrate")) {
                        JSONObject jSONObject2 = new JSONObject();
                        if (tVar.y2 == 1 && tVar.z7 == 1) {
                            JSONObject m0 = tVar.m0(23);
                            if (m0 != null) {
                                try {
                                    if (m0.has("predict_bitrate")) {
                                        int optInt = m0.optInt("predict_bitrate");
                                        if (optInt > 0) {
                                            jSONObject2.put("live_strategy_predict_bitrate", optInt);
                                        }
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append("player get predictBitrate: ");
                                        LIZ.append(jSONObject2);
                                        X1D.LIZIZ(LIZ);
                                        C46496IMq.LIZJ();
                                    }
                                } catch (Exception e3) {
                                    C16880lQ.LLLLIIL(e3);
                                }
                            }
                            return jSONObject2.toString();
                        }
                    }
                    return "";
                }
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject3.put("bitrate", tVar.LJLJJI.K0 / 1000);
                    jSONObject3.put("neptuneName", tVar.h);
                    JSONObject jSONObject5 = (JSONObject) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 20, null, jSONObject3);
                    if (jSONObject5 != null && jSONObject5.has("Bandwidth")) {
                        jSONObject4.put("live_strategy_probe_bandwidth", jSONObject5.optInt("Bandwidth") * 1024);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("player get predictBandWidth: ");
                    LIZ2.append(jSONObject4);
                    X1D.LIZIZ(LIZ2);
                    C46496IMq.LIZJ();
                } catch (Exception e4) {
                    C16880lQ.LLLLIIL(e4);
                }
                return jSONObject4.toString();
            }
            if (method.getName().equals("didReceivePacket") && objArr.length >= 3) {
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Long) objArr[1]).longValue();
                long longValue4 = ((Long) objArr[2]).longValue();
                java.util.Map map = (java.util.Map) objArr[3];
                if (tVar.g7 != 0 && intValue2 == 0) {
                    if ((CastIntegerProtector.parseInt((String) map.get(73)) & 1) == 1) {
                        float floatOption = tVar.LJLLL.getFloatOption(151, 0.0f);
                        long j3 = tVar.j7;
                        if (j3 == -1) {
                            tVar.j7 = longValue4;
                            tVar.f7 = 0;
                        } else if (floatOption > 0.0f) {
                            long j4 = longValue4 - j3;
                            float f = 1.0f - (tVar.f7 / ((floatOption * ((float) j4)) / 1000.0f));
                            tVar.k7 = f;
                            if (tVar.h7 == 1 && f > tVar.l7 && j4 > tVar.i7) {
                                tVar.LJLLI.LIZIZ(new C48315Ixj(-100021, "try out all urls", C03660Ck.LIZJ("url", "try out url again because of drop frame")), false);
                            }
                        }
                    }
                    tVar.f7++;
                }
            }
        }
        return null;
    }
}
