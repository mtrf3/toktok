package X;

import com.ss.videoarch.strategy.LiveStrategyManager;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79350VCg extends C79359VCp {
    public static volatile C79350VCg LJIIJ;
    public final VD2 LIZJ;
    public String LIZLLL;
    public final JSONObject LJ;
    public JSONObject LJFF;
    public final ReentrantLock LJI;
    public final JSONArray LJII;
    public JSONObject LJIIIIZZ;
    public JSONObject LJIIIZ;

    public C79350VCg() {
        super(3);
        this.LIZJ = new VD2();
        this.LIZLLL = "";
        this.LJ = new JSONObject();
        this.LJFF = null;
        this.LJI = new ReentrantLock();
        JSONArray jSONArray = new JSONArray();
        this.LJII = jSONArray;
        this.LJIIIIZZ = new JSONObject();
        this.LJIIIZ = null;
        this.LIZ = "TypePlayFeature";
        VD4 vd4 = (VD4) this.LIZIZ;
        if (vd4 != null) {
            vd4.LIZ = "TypePlayFeature";
        }
        jSONArray.put("PLAY-VideoBuffer").put("PLAY-AudioBuffer");
    }

    public static C79350VCg LJ() {
        if (LJIIJ == null) {
            synchronized (C79350VCg.class) {
                if (LJIIJ == null) {
                    LJIIJ = new C79350VCg();
                }
            }
        }
        return LJIIJ;
    }

    public final void LIZLLL() {
        C79352VCi c79352VCi;
        long j;
        for (Map.Entry<String, InterfaceC79328VBk> entry : LiveStrategyManager.inst().mListenerMap.entrySet()) {
            String key = entry.getKey();
            InterfaceC79328VBk value = entry.getValue();
            if (value != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    value.LIZ("bundle", new JSONObject().put("featuresBundleList", this.LJII).put("featuresData", jSONObject));
                    jSONObject.put("PLAY-SessionID", key);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                try {
                    String optString = jSONObject.optString("PLAY-SessionID", "");
                    if (optString.length() != 0) {
                        synchronized (this.LIZJ) {
                            if (this.LIZJ.containsKey(optString)) {
                                c79352VCi = this.LIZJ.get(optString);
                            } else {
                                c79352VCi = new C79352VCi();
                                c79352VCi.mSessionId = optString;
                            }
                        }
                        c79352VCi.isValid = true;
                        long j2 = -1;
                        if (jSONObject.has("PLAY-VideoBuffer")) {
                            j = jSONObject.optLong("PLAY-VideoBuffer");
                        } else {
                            j = -1;
                        }
                        if (jSONObject.has("PLAY-AudioBuffer")) {
                            j2 = jSONObject.optLong("PLAY-AudioBuffer");
                        }
                        c79352VCi.mVideoBuffer = j;
                        c79352VCi.mAudioBuffer = j2;
                        c79352VCi.mVideoBufferList.add(Long.valueOf(j));
                        if (c79352VCi.mVideoBufferList.size() > 200) {
                            c79352VCi.mVideoBufferList.remove();
                        }
                        c79352VCi.mAudioBufferList.add(Long.valueOf(j2));
                        if (c79352VCi.mAudioBufferList.size() > 200) {
                            c79352VCi.mAudioBufferList.remove();
                        }
                        synchronized (this.LIZJ) {
                            this.LIZJ.put(optString, c79352VCi);
                        }
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r8.equals("stream_session_vv_id") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r8.equals("enter_from") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r8.equals("is_preview") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.Object r7, java.lang.String r8) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJI
            r0.lock()
            org.json.JSONObject r0 = r6.LJFF
            if (r0 == 0) goto L18
            int r0 = r8.hashCode()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "stream_session_vv_id"
            java.lang.String r5 = "neptuneName"
            java.lang.String r4 = "is_preview"
            switch(r0) {
                case -818786127: goto L8b;
                case 855771538: goto L68;
                case 970568508: goto L25;
                case 1182125491: goto L1e;
                default: goto L18;
            }
        L18:
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJI
            r0.unlock()
            return r7
        L1e:
            boolean r0 = r8.equals(r4)
            if (r0 != 0) goto L48
            goto L18
        L25:
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L2c
            goto L18
        L2c:
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L48
            org.json.JSONObject r0 = r6.LJFF
            boolean r0 = r0.has(r5)
            if (r0 == 0) goto L48
            org.json.JSONObject r0 = r6.LJFF
            java.lang.String r1 = r0.optString(r5)
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJI
            r0.unlock()
            return r1
        L48:
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L6f
            org.json.JSONObject r0 = r6.LJFF
            boolean r0 = r0.has(r4)
            if (r0 == 0) goto L6f
            org.json.JSONObject r0 = r6.LJFF
            int r1 = r0.optInt(r4)
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJI
            r0.unlock()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L68:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L6f
            goto L18
        L6f:
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L92
            org.json.JSONObject r0 = r6.LJFF
            boolean r0 = r0.has(r3)
            if (r0 == 0) goto L92
            org.json.JSONObject r0 = r6.LJFF
            java.lang.String r1 = r0.optString(r3)
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJI
            r0.unlock()
            return r1
        L8b:
            boolean r0 = r8.equals(r2)
            if (r0 != 0) goto L92
            goto L18
        L92:
            java.lang.Class r1 = r7.getClass()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L18
            org.json.JSONObject r0 = r6.LJFF
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L18
            org.json.JSONObject r0 = r6.LJFF
            java.lang.String r1 = r0.optString(r2)
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJI
            r0.unlock()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79350VCg.LIZJ(java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r14, org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79350VCg.LJFF(int, org.json.JSONObject):void");
    }
}
