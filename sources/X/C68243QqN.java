package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.QqN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68243QqN extends AbstractC68187QpT {
    @Override // X.AbstractC68187QpT
    public final void LJIIIIZZ() {
    }

    public C68243QqN(C68241QqL c68241QqL) {
        super(c68241QqL);
    }

    public static List LJJIIJ(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            int i2 = 0;
            do {
                int i3 = (i * 64) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                    i2++;
                }
                arrayList.add(Long.valueOf(j));
            } while (i2 < 64);
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean LJJIJIIJI(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public final long LJIJI(byte[] bArr) {
        this.LIZ.LJIL().LJFF();
        MessageDigest LJIILIIL = C68083Qnn.LJIILIIL();
        if (LJIILIIL == null) {
            this.LIZ.LIZJ().LJFF.LIZ("Failed to get MD5");
            return 0L;
        }
        return C68083Qnn.LJJLIIIIJ(LJIILIIL.digest(bArr));
    }

    public final zzaw LJIL(C68276Qqu c68276Qqu) {
        String str;
        Object LLJJIII;
        Bundle LJIJJ = LJIJJ(c68276Qqu.LIZJ, true);
        if (LJIJJ.containsKey("_o") && (LLJJIII = C16880lQ.LLJJIII(LJIJJ, "_o")) != null) {
            str = LLJJIII.toString();
        } else {
            str = "app";
        }
        String LJJIIZI = C78540Us4.LJJIIZI(c68276Qqu.LIZ, C68107QoB.LIZ, C68107QoB.LIZJ);
        if (LJJIIZI == null) {
            LJJIIZI = c68276Qqu.LIZ;
        }
        return new zzaw(LJJIIZI, new zzau(LJIJJ), str, c68276Qqu.LIZIZ);
    }

    public final C68260Qqe LJJ(C68144Qom c68144Qom) {
        C68264Qqi LJIJ = C68260Qqe.LJIJ();
        long j = c68144Qom.LJ;
        if (LJIJ.LJLJI) {
            LJIJ.LJIIJ();
            LJIJ.LJLJI = false;
        }
        C68260Qqe.LJIL(j, (C68260Qqe) LJIJ.LJLILLLLZI);
        C68182QpO c68182QpO = new C68182QpO(c68144Qom.LJFF);
        while (c68182QpO.hasNext()) {
            String str = (String) c68182QpO.LJLIL.next();
            C68281Qqz LJIJ2 = C68257Qqb.LJIJ();
            LJIJ2.LJIIL(str);
            Object LJJLIIIIJ = c68144Qom.LJFF.LJJLIIIIJ(str);
            QH7.LJIIIIZZ(LJJLIIIIJ);
            if (LJIJ2.LJLJI) {
                LJIJ2.LJIIJ();
                LJIJ2.LJLJI = false;
            }
            C68257Qqb.LJIL((C68257Qqb) LJIJ2.LJLILLLLZI);
            if (LJIJ2.LJLJI) {
                LJIJ2.LJIIJ();
                LJIJ2.LJLJI = false;
            }
            C68257Qqb.LJJI((C68257Qqb) LJIJ2.LJLILLLLZI);
            if (LJIJ2.LJLJI) {
                LJIJ2.LJIIJ();
                LJIJ2.LJLJI = false;
            }
            C68257Qqb.LJJII((C68257Qqb) LJIJ2.LJLILLLLZI);
            if (LJIJ2.LJLJI) {
                LJIJ2.LJIIJ();
                LJIJ2.LJLJI = false;
            }
            ((C68257Qqb) LJIJ2.LJLILLLLZI).zzk = C84682XLi.LJLJJI;
            if (LJJLIIIIJ instanceof String) {
                LJIJ2.LJIILIIL((String) LJJLIIIIJ);
            } else if (LJJLIIIIJ instanceof Long) {
                LJIJ2.LJIIJJI(((Long) LJJLIIIIJ).longValue());
            } else if (LJJLIIIIJ instanceof Double) {
                double doubleValue = ((Double) LJJLIIIIJ).doubleValue();
                if (LJIJ2.LJLJI) {
                    LJIJ2.LJIIJ();
                    LJIJ2.LJLJI = false;
                }
                C68257Qqb.LJJIFFI((C68257Qqb) LJIJ2.LJLILLLLZI, doubleValue);
            } else if (LJJLIIIIJ instanceof Bundle[]) {
                ArrayList arrayList = new ArrayList();
                for (Bundle bundle : (Bundle[]) LJJLIIIIJ) {
                    if (bundle != null) {
                        C68281Qqz LJIJ3 = C68257Qqb.LJIJ();
                        for (String str2 : bundle.keySet()) {
                            C68281Qqz LJIJ4 = C68257Qqb.LJIJ();
                            LJIJ4.LJIIL(str2);
                            Object LLJJIII = C16880lQ.LLJJIII(bundle, str2);
                            if (LLJJIII instanceof Long) {
                                LJIJ4.LJIIJJI(((Long) LLJJIII).longValue());
                            } else if (LLJJIII instanceof String) {
                                LJIJ4.LJIILIIL((String) LLJJIII);
                            } else if (LLJJIII instanceof Double) {
                                double doubleValue2 = ((Double) LLJJIII).doubleValue();
                                if (LJIJ4.LJLJI) {
                                    LJIJ4.LJIIJ();
                                    LJIJ4.LJLJI = false;
                                }
                                C68257Qqb.LJJIFFI((C68257Qqb) LJIJ4.LJLILLLLZI, doubleValue2);
                            }
                            if (LJIJ3.LJLJI) {
                                LJIJ3.LJIIJ();
                                LJIJ3.LJLJI = false;
                            }
                            C68257Qqb c68257Qqb = (C68257Qqb) LJIJ3.LJLILLLLZI;
                            YIN LJIIIIZZ = LJIJ4.LJIIIIZZ();
                            XM7 xm7 = c68257Qqb.zzk;
                            if (!xm7.LIZIZ()) {
                                c68257Qqb.zzk = YIN.LJIILJJIL(xm7);
                            }
                            c68257Qqb.zzk.add(LJIIIIZZ);
                        }
                        if (((C68257Qqb) LJIJ3.LJLILLLLZI).zzk.size() > 0) {
                            arrayList.add(LJIJ3.LJIIIIZZ());
                        }
                    }
                }
                if (LJIJ2.LJLJI) {
                    LJIJ2.LJIIJ();
                    LJIJ2.LJLJI = false;
                }
                C68257Qqb c68257Qqb2 = (C68257Qqb) LJIJ2.LJLILLLLZI;
                XM7 xm72 = c68257Qqb2.zzk;
                if (!xm72.LIZIZ()) {
                    c68257Qqb2.zzk = YIN.LJIILJJIL(xm72);
                }
                YIP.LJI(arrayList, c68257Qqb2.zzk);
            } else {
                this.LIZ.LIZJ().LJFF.LIZIZ(LJJLIIIIJ, "Ignoring invalid (type) event param value");
            }
            LJIJ.LJIILIIL(LJIJ2);
        }
        return (C68260Qqe) LJIJ.LJIIIIZZ();
    }

    public final String LJJIFFI(C68278Qqw c68278Qqw) {
        Long l;
        Long l2;
        Double d;
        StringBuilder LIZJ = C278817o.LIZJ("\nbatch {\n");
        for (C68246QqQ c68246QqQ : c68278Qqw.zze) {
            if (c68246QqQ != null) {
                LJIILIIL(1, LIZJ);
                LIZJ.append("bundle {\n");
                if (c68246QqQ.LJLIL()) {
                    LJIILLIIL(LIZJ, 1, "protocol_version", Integer.valueOf(c68246QqQ.zzh));
                }
                C68572Qvg.LIZ();
                if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJLJI) && c68246QqQ.LJLJJI()) {
                    LJIILLIIL(LIZJ, 1, "session_stitching_token", c68246QqQ.zzae);
                }
                LJIILLIIL(LIZJ, 1, "platform", c68246QqQ.zzp);
                if (c68246QqQ.LJL()) {
                    LJIILLIIL(LIZJ, 1, "gmp_version", Long.valueOf(c68246QqQ.zzx));
                }
                if (c68246QqQ.LJLJLJ()) {
                    LJIILLIIL(LIZJ, 1, "uploading_gmp_version", Long.valueOf(c68246QqQ.zzy));
                }
                if (c68246QqQ.LJJZZI()) {
                    LJIILLIIL(LIZJ, 1, "dynamite_version", Long.valueOf(c68246QqQ.zzV));
                }
                if (c68246QqQ.LJJLJLI()) {
                    LJIILLIIL(LIZJ, 1, "config_version", Long.valueOf(c68246QqQ.zzN));
                }
                LJIILLIIL(LIZJ, 1, "gmp_app_id", c68246QqQ.zzF);
                LJIILLIIL(LIZJ, 1, "admob_app_id", c68246QqQ.zzS);
                LJIILLIIL(LIZJ, 1, "app_id", c68246QqQ.zzv);
                LJIILLIIL(LIZJ, 1, "app_version", c68246QqQ.zzw);
                if (c68246QqQ.LJJLIL()) {
                    LJIILLIIL(LIZJ, 1, "app_version_major", Integer.valueOf(c68246QqQ.zzJ));
                }
                LJIILLIIL(LIZJ, 1, "firebase_instance_id", c68246QqQ.zzI);
                if (c68246QqQ.LJJZ()) {
                    LJIILLIIL(LIZJ, 1, "dev_cert_hash", Long.valueOf(c68246QqQ.zzC));
                }
                LJIILLIIL(LIZJ, 1, "app_store", c68246QqQ.zzu);
                if (c68246QqQ.LJLJL()) {
                    LJIILLIIL(LIZJ, 1, "upload_timestamp_millis", Long.valueOf(c68246QqQ.zzk));
                }
                if (c68246QqQ.LJLJJL()) {
                    LJIILLIIL(LIZJ, 1, "start_timestamp_millis", Long.valueOf(c68246QqQ.zzl));
                }
                if (c68246QqQ.LJJZZIII()) {
                    LJIILLIIL(LIZJ, 1, "end_timestamp_millis", Long.valueOf(c68246QqQ.zzm));
                }
                if (c68246QqQ.LJLIIL()) {
                    LJIILLIIL(LIZJ, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c68246QqQ.zzn));
                }
                if (c68246QqQ.LJLIIIL()) {
                    LJIILLIIL(LIZJ, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c68246QqQ.zzo));
                }
                LJIILLIIL(LIZJ, 1, "app_instance_id", c68246QqQ.zzB);
                LJIILLIIL(LIZJ, 1, "resettable_device_id", c68246QqQ.zzz);
                LJIILLIIL(LIZJ, 1, "ds_id", c68246QqQ.zzP);
                if (c68246QqQ.LJLI()) {
                    LJIILLIIL(LIZJ, 1, "limited_ad_tracking", Boolean.valueOf(c68246QqQ.zzA));
                }
                LJIILLIIL(LIZJ, 1, "os_version", c68246QqQ.zzq);
                LJIILLIIL(LIZJ, 1, "device_model", c68246QqQ.zzr);
                LJIILLIIL(LIZJ, 1, "user_default_language", c68246QqQ.zzs);
                if (c68246QqQ.LJLJJLL()) {
                    LJIILLIIL(LIZJ, 1, "time_zone_offset_minutes", Integer.valueOf(c68246QqQ.zzt));
                }
                if (c68246QqQ.LJJLJ()) {
                    LJIILLIIL(LIZJ, 1, "bundle_sequential_index", Integer.valueOf(c68246QqQ.zzD));
                }
                if (c68246QqQ.LJLJI()) {
                    LJIILLIIL(LIZJ, 1, "service_upload", Boolean.valueOf(c68246QqQ.zzG));
                }
                LJIILLIIL(LIZJ, 1, "health_monitor", c68246QqQ.zzE);
                if (!this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIIJ) && c68246QqQ.LJJLIIJ()) {
                    long j = c68246QqQ.zzO;
                    if (j != 0) {
                        LJIILLIIL(LIZJ, 1, "android_id", Long.valueOf(j));
                    }
                }
                if (c68246QqQ.LJLILLLLZI()) {
                    LJIILLIIL(LIZJ, 1, "retry_counter", Integer.valueOf(c68246QqQ.zzR));
                }
                if (c68246QqQ.LJJLL()) {
                    LJIILLIIL(LIZJ, 1, "consent_signals", c68246QqQ.zzY);
                }
                XM7<C68259Qqd> xm7 = c68246QqQ.zzj;
                if (xm7 != null) {
                    for (C68259Qqd c68259Qqd : xm7) {
                        if (c68259Qqd != null) {
                            LJIILIIL(2, LIZJ);
                            LIZJ.append("user_property {\n");
                            if (c68259Qqd.LJJIIZ()) {
                                l = Long.valueOf(c68259Qqd.zzf);
                            } else {
                                l = null;
                            }
                            LJIILLIIL(LIZJ, 2, "set_timestamp_millis", l);
                            LJIILLIIL(LIZJ, 2, "name", this.LIZ.LJIIL.LJFF(c68259Qqd.zzg));
                            LJIILLIIL(LIZJ, 2, "string_value", c68259Qqd.zzh);
                            if (c68259Qqd.LJJIIJZLJL()) {
                                l2 = Long.valueOf(c68259Qqd.zzi);
                            } else {
                                l2 = null;
                            }
                            LJIILLIIL(LIZJ, 2, "int_value", l2);
                            if (c68259Qqd.LJJIIJ()) {
                                d = Double.valueOf(c68259Qqd.zzk);
                            } else {
                                d = null;
                            }
                            LJIILLIIL(LIZJ, 2, "double_value", d);
                            LJIILIIL(2, LIZJ);
                            LIZJ.append("}\n");
                        }
                    }
                }
                XM7<C68265Qqj> xm72 = c68246QqQ.zzH;
                if (xm72 != null) {
                    for (C68265Qqj c68265Qqj : xm72) {
                        if (c68265Qqj != null) {
                            LJIILIIL(2, LIZJ);
                            LIZJ.append("audience_membership {\n");
                            if (c68265Qqj.LJJII()) {
                                LJIILLIIL(LIZJ, 2, "audience_id", Integer.valueOf(c68265Qqj.zzf));
                            }
                            if (c68265Qqj.LJJIII()) {
                                LJIILLIIL(LIZJ, 2, "new_audience", Boolean.valueOf(c68265Qqj.zzi));
                            }
                            LJIILL(LIZJ, "current_data", c68265Qqj.LJIJJ());
                            if (c68265Qqj.LJJIIJ()) {
                                LJIILL(LIZJ, "previous_data", c68265Qqj.LJIJJLI());
                            }
                            LJIILIIL(2, LIZJ);
                            LIZJ.append("}\n");
                        }
                    }
                }
                XM7<C68260Qqe> xm73 = c68246QqQ.zzi;
                if (xm73 != null) {
                    for (C68260Qqe c68260Qqe : xm73) {
                        if (c68260Qqe != null) {
                            LJIILIIL(2, LIZJ);
                            LIZJ.append("event {\n");
                            LJIILLIIL(LIZJ, 2, "name", this.LIZ.LJIIL.LIZLLL(c68260Qqe.zzg));
                            if (c68260Qqe.LJJIFFI()) {
                                LJIILLIIL(LIZJ, 2, "timestamp_millis", Long.valueOf(c68260Qqe.zzh));
                            }
                            if (c68260Qqe.LJJI()) {
                                LJIILLIIL(LIZJ, 2, "previous_timestamp_millis", Long.valueOf(c68260Qqe.zzi));
                            }
                            if (c68260Qqe.LJJ()) {
                                LJIILLIIL(LIZJ, 2, "count", Integer.valueOf(c68260Qqe.zzj));
                            }
                            if (c68260Qqe.zzf.size() != 0) {
                                LJIIJJI(LIZJ, 2, c68260Qqe.zzf);
                            }
                            LJIILIIL(2, LIZJ);
                            LIZJ.append("}\n");
                        }
                    }
                }
                LJIILIIL(1, LIZJ);
                LIZJ.append("}\n");
            }
        }
        LIZJ.append("}\n");
        return LIZJ.toString();
    }

    public final String LJJII(C68266Qqk c68266Qqk) {
        StringBuilder LIZJ = C278817o.LIZJ("\nproperty_filter {\n");
        if (c68266Qqk.LJIL()) {
            LJIILLIIL(LIZJ, 0, "filter_id", Integer.valueOf(c68266Qqk.zzf));
        }
        LJIILLIIL(LIZJ, 0, "property_name", this.LIZ.LJIIL.LJFF(c68266Qqk.zzg));
        String LJIILJJIL = LJIILJJIL(c68266Qqk.zzi, c68266Qqk.zzj, c68266Qqk.zzk);
        if (!LJIILJJIL.isEmpty()) {
            LJIILLIIL(LIZJ, 0, "filter_type", LJIILJJIL);
        }
        LJIIL(LIZJ, 1, c68266Qqk.LJIJ());
        LIZJ.append("}\n");
        return LIZJ.toString();
    }

    public final byte[] LJJIJIIJIL(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to gzip content");
            throw e;
        }
    }

    public static final C68257Qqb LJIIIZ(C68260Qqe c68260Qqe, String str) {
        for (C68257Qqb c68257Qqb : c68260Qqe.zzf) {
            if (c68257Qqb.zzf.equals(str)) {
                return c68257Qqb;
            }
        }
        return null;
    }

    public static final Object LJIIJ(C68260Qqe c68260Qqe, String str) {
        C68257Qqb LJIIIZ = LJIIIZ(c68260Qqe, str);
        if (LJIIIZ != null) {
            if (LJIIIZ.LJJIIZI()) {
                return LJIIIZ.zzg;
            }
            if (LJIIIZ.LJJIIJZLJL()) {
                return Long.valueOf(LJIIIZ.zzh);
            }
            if (LJIIIZ.LJJIII()) {
                return Double.valueOf(LJIIIZ.zzj);
            }
            if (LJIIIZ.zzk.size() > 0) {
                XM7<C68257Qqb> xm7 = LJIIIZ.zzk;
                ArrayList arrayList = new ArrayList();
                for (C68257Qqb c68257Qqb : xm7) {
                    if (c68257Qqb != null) {
                        Bundle bundle = new Bundle();
                        for (C68257Qqb c68257Qqb2 : c68257Qqb.zzk) {
                            if (c68257Qqb2.LJJIIZI()) {
                                bundle.putString(c68257Qqb2.zzf, c68257Qqb2.zzg);
                            } else if (c68257Qqb2.LJJIIJZLJL()) {
                                bundle.putLong(c68257Qqb2.zzf, c68257Qqb2.zzh);
                            } else if (c68257Qqb2.LJJIII()) {
                                bundle.putDouble(c68257Qqb2.zzf, c68257Qqb2.zzj);
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static final void LJIILIIL(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static int LJIJ(C68253QqX c68253QqX, String str) {
        for (int i = 0; i < ((C68246QqQ) c68253QqX.LJLILLLLZI).zzj.size(); i++) {
            if (str.equals(((C68259Qqd) ((C68246QqQ) c68253QqX.LJLILLLLZI).zzj.get(i)).zzg)) {
                return i;
            }
        }
        return -1;
    }

    public static YIR LJJI(YIR yir, byte[] bArr) {
        C68313QrV c68313QrV = C68313QrV.LIZJ;
        if (c68313QrV == null) {
            synchronized (C68313QrV.class) {
                c68313QrV = C68313QrV.LIZJ;
                if (c68313QrV == null) {
                    c68313QrV = P9D.LIZIZ(C68313QrV.class);
                    C68313QrV.LIZJ = c68313QrV;
                }
            }
            if (c68313QrV == null) {
                yir.getClass();
                yir.LJII(bArr, bArr.length, C68313QrV.LIZ());
                return yir;
            }
        }
        yir.getClass();
        yir.LJII(bArr, bArr.length, c68313QrV);
        return yir;
    }

    public static boolean LJJIIZI(int i, InterfaceC68330Qrm interfaceC68330Qrm) {
        if (i < ((C84686XLm) interfaceC68330Qrm).LJLJI * 64) {
            if (((1 << (i % 64)) & ((Long) ListProtector.get(interfaceC68330Qrm, i / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Bundle LJIJJ(java.util.Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ((InterfaceC68321Qrd) C68297QrF.LJLILLLLZI.LJLIL.zza()).zza();
                    if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIJJI)) {
                        ArrayList arrayList = (ArrayList) obj;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            arrayList2.add(LJIJJ((java.util.Map) ListProtector.get(arrayList, i), false));
                        }
                        bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                    } else {
                        ArrayList arrayList3 = (ArrayList) obj;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        int size2 = arrayList3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            arrayList4.add(LJIJJ((java.util.Map) ListProtector.get(arrayList3, i2), false));
                        }
                        bundle.putParcelableArrayList(str, arrayList4);
                    }
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public final Parcelable LJIJJLI(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (C67308QbI unused) {
            this.LIZ.LIZJ().LJFF.LIZ("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final List LJJIII(InterfaceC68330Qrm interfaceC68330Qrm, List list) {
        int i;
        ArrayList arrayList = new ArrayList(interfaceC68330Qrm);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.LIZ.LIZJ().LJIIIIZZ.LIZJ(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    ListProtector.set(arrayList, intValue, Long.valueOf(((Long) ListProtector.get(arrayList, intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            i = size;
            size = size2;
            if (size2 < 0 || ((Long) ListProtector.get(arrayList, size2)).longValue() != 0) {
                break;
            }
            size2--;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if ((r6 instanceof android.os.Parcelable[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r6 = (android.os.Parcelable[]) r6;
        r3 = r6.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r2 >= r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r1 = r6[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if ((r1 instanceof android.os.Bundle) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r7.add(LJJIIJZLJL(false, (android.os.Bundle) r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r5.put(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if ((r6 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        r6 = (java.util.ArrayList) r6;
        r3 = r6.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r2 >= r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if ((r1 instanceof android.os.Bundle) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r7.add(LJJIIJZLJL(false, (android.os.Bundle) r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if ((r6 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        r7.add(LJJIIJZLJL(false, (android.os.Bundle) r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map LJJIIJZLJL(boolean r11, android.os.Bundle r12) {
        /*
            r10 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r9 = r0.iterator()
        Ld:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lae
            java.lang.Object r4 = r9.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = X.C16880lQ.LLJJIII(r12, r4)
            X.QrF r0 = X.C68297QrF.LJLILLLLZI
            X.Ol4 r0 = r0.LJLIL
            java.lang.Object r0 = r0.zza()
            X.Qrd r0 = (X.InterfaceC68321Qrd) r0
            r0.zza()
            X.Qmz r0 = r10.LIZ
            X.Qn0 r2 = r0.LJI
            r1 = 0
            X.QnX r0 = X.C68555QvP.LJJLIIIJJI
            boolean r0 = r2.LJIILJJIL(r1, r0)
            if (r0 == 0) goto L9a
            boolean r0 = r6 instanceof android.os.Parcelable[]
            if (r0 != 0) goto L43
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 != 0) goto L43
            boolean r0 = r6 instanceof android.os.Bundle
            if (r0 == 0) goto La7
        L43:
            if (r11 == 0) goto Ld
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r0 = r6 instanceof android.os.Parcelable[]
            r8 = 0
            if (r0 == 0) goto L67
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r3 = r6.length
            r2 = 0
        L53:
            if (r2 >= r3) goto L95
            r1 = r6[r2]
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 == 0) goto L64
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.util.Map r0 = r10.LJJIIJZLJL(r8, r1)
            r7.add(r0)
        L64:
            int r2 = r2 + 1
            goto L53
        L67:
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto L88
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r3 = r6.size()
            r2 = 0
        L72:
            if (r2 >= r3) goto L95
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r2)
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 == 0) goto L85
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.util.Map r0 = r10.LJJIIJZLJL(r8, r1)
            r7.add(r0)
        L85:
            int r2 = r2 + 1
            goto L72
        L88:
            boolean r0 = r6 instanceof android.os.Bundle
            if (r0 == 0) goto L95
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.util.Map r0 = r10.LJJIIJZLJL(r8, r6)
            r7.add(r0)
        L95:
            r5.put(r4, r7)
            goto Ld
        L9a:
            boolean r0 = r6 instanceof android.os.Bundle[]
            if (r0 != 0) goto L43
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 != 0) goto L43
            boolean r0 = r6 instanceof android.os.Bundle
            if (r0 == 0) goto La7
            goto L43
        La7:
            if (r6 == 0) goto Ld
            r5.put(r4, r6)
            goto Ld
        Lae:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68243QqN.LJJIIJZLJL(boolean, android.os.Bundle):java.util.Map");
    }

    public final boolean LJJIJ(long j, long j2) {
        if (j != 0 && j2 > 0) {
            this.LIZ.LJIILIIL.getClass();
            if (Math.abs(System.currentTimeMillis() - j) > j2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final String LJIILJJIL(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void LJIILL(StringBuilder sb, String str, C68263Qqh c68263Qqh) {
        Integer num;
        Integer num2;
        Long l;
        if (c68263Qqh == null) {
            return;
        }
        LJIILIIL(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (((C84686XLm) c68263Qqh.zzf).LJLJI != 0) {
            LJIILIIL(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Object obj : c68263Qqh.zzf) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
                i = i2;
            }
            sb.append('\n');
        }
        if (((C84686XLm) c68263Qqh.zze).LJLJI != 0) {
            LJIILIIL(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Object obj2 : c68263Qqh.zze) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(obj2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (c68263Qqh.zzg.size() != 0) {
            LJIILIIL(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (C68274Qqs c68274Qqs : c68263Qqh.zzg) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                if (c68274Qqs.LJJ()) {
                    num2 = Integer.valueOf(c68274Qqs.zzf);
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (c68274Qqs.LJIL()) {
                    l = Long.valueOf(c68274Qqs.zzg);
                } else {
                    l = null;
                }
                sb.append(l);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (c68263Qqh.zzh.size() != 0) {
            LJIILIIL(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (C68271Qqp c68271Qqp : c68263Qqh.zzh) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                if (c68271Qqp.LJIL()) {
                    num = Integer.valueOf(c68271Qqp.zzf);
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                Iterator it = c68271Qqp.zzg.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        LJIILIIL(3, sb);
        sb.append("}\n");
    }

    public static final void LJJIJIL(C68264Qqi c68264Qqi, String str, Object obj) {
        List unmodifiableList = Collections.unmodifiableList(((C68260Qqe) c68264Qqi.LJLILLLLZI).zzf);
        int i = 0;
        while (true) {
            if (i < unmodifiableList.size()) {
                if (str.equals(((C68257Qqb) ListProtector.get(unmodifiableList, i)).zzf)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        C68281Qqz LJIJ = C68257Qqb.LJIJ();
        LJIJ.LJIIL(str);
        if (obj instanceof Long) {
            LJIJ.LJIIJJI(((Long) obj).longValue());
        }
        if (i >= 0) {
            if (c68264Qqi.LJLJI) {
                c68264Qqi.LJIIJ();
                c68264Qqi.LJLJI = false;
            }
            C68260Qqe c68260Qqe = (C68260Qqe) c68264Qqi.LJLILLLLZI;
            YIN LJIIIIZZ = LJIJ.LJIIIIZZ();
            c68260Qqe.LJJII();
            c68260Qqe.zzf.set(i, LJIIIIZZ);
            return;
        }
        c68264Qqi.LJIILIIL(LJIJ);
    }

    public final void LJIIJJI(StringBuilder sb, int i, XM7 xm7) {
        String str;
        String str2;
        Long l;
        if (xm7 == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = xm7.iterator();
        while (it.hasNext()) {
            C68257Qqb c68257Qqb = (C68257Qqb) it.next();
            if (c68257Qqb != null) {
                LJIILIIL(i2, sb);
                sb.append("param {\n");
                Double d = null;
                if (c68257Qqb.LJJIIZ()) {
                    str = this.LIZ.LJIIL.LJ(c68257Qqb.zzf);
                } else {
                    str = null;
                }
                LJIILLIIL(sb, i2, "name", str);
                if (c68257Qqb.LJJIIZI()) {
                    str2 = c68257Qqb.zzg;
                } else {
                    str2 = null;
                }
                LJIILLIIL(sb, i2, "string_value", str2);
                if (c68257Qqb.LJJIIJZLJL()) {
                    l = Long.valueOf(c68257Qqb.zzh);
                } else {
                    l = null;
                }
                LJIILLIIL(sb, i2, "int_value", l);
                if (c68257Qqb.LJJIII()) {
                    d = Double.valueOf(c68257Qqb.zzj);
                }
                LJIILLIIL(sb, i2, "double_value", d);
                if (c68257Qqb.zzk.size() > 0) {
                    LJIIJJI(sb, i2, c68257Qqb.zzk);
                }
                LJIILIIL(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void LJIIL(StringBuilder sb, int i, C68267Qql c68267Qql) {
        String str;
        if (c68267Qql == null) {
            return;
        }
        LJIILIIL(i, sb);
        sb.append("filter {\n");
        if (c68267Qql.LJJ()) {
            LJIILLIIL(sb, i, "complement", Boolean.valueOf(c68267Qql.zzh));
        }
        if (c68267Qql.LJJIFFI()) {
            LJIILLIIL(sb, i, "param_name", this.LIZ.LJIIL.LJ(c68267Qql.zzi));
        }
        if (c68267Qql.LJJII()) {
            int i2 = i + 1;
            C68270Qqo LJIJJLI = c68267Qql.LJIJJLI();
            if (LJIJJLI != null) {
                LJIILIIL(i2, sb);
                sb.append("string_filter {\n");
                if (LJIJJLI.LJIL()) {
                    switch (LJIJJLI.LJJ()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    LJIILLIIL(sb, i2, "match_type", str);
                }
                if (LJIJJLI.LJIJJLI()) {
                    LJIILLIIL(sb, i2, "expression", LJIJJLI.zzg);
                }
                if (LJIJJLI.LJIJJ()) {
                    LJIILLIIL(sb, i2, "case_sensitive", Boolean.valueOf(LJIJJLI.zzh));
                }
                if (LJIJJLI.zzi.size() > 0) {
                    LJIILIIL(i2 + 1, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : LJIJJLI.zzi) {
                        LJIILIIL(i2 + 2, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                LJIILIIL(i2, sb);
                sb.append("}\n");
            }
        }
        if (c68267Qql.LJJI()) {
            LJIIZILJ(sb, i + 1, "number_filter", c68267Qql.LJIJJ());
        }
        LJIILIIL(i, sb);
        sb.append("}\n");
    }

    public static final void LJIILLIIL(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        LJIILIIL(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void LJIIZILJ(StringBuilder sb, int i, String str, C68269Qqn c68269Qqn) {
        String str2;
        if (c68269Qqn == null) {
            return;
        }
        LJIILIIL(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c68269Qqn.LJIJJ()) {
            int LJJIFFI = c68269Qqn.LJJIFFI();
            if (LJJIFFI != 1) {
                if (LJJIFFI != 2) {
                    if (LJJIFFI != 3) {
                        if (LJJIFFI != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            LJIILLIIL(sb, i, "comparison_type", str2);
        }
        if (c68269Qqn.LJIL()) {
            LJIILLIIL(sb, i, "match_as_float", Boolean.valueOf(c68269Qqn.zzg));
        }
        if (c68269Qqn.LJIJJLI()) {
            LJIILLIIL(sb, i, "comparison_value", c68269Qqn.zzh);
        }
        if (c68269Qqn.LJJI()) {
            LJIILLIIL(sb, i, "min_comparison_value", c68269Qqn.zzi);
        }
        if (c68269Qqn.LJJ()) {
            LJIILLIIL(sb, i, "max_comparison_value", c68269Qqn.zzj);
        }
        LJIILIIL(i, sb);
        sb.append("}\n");
    }
}
