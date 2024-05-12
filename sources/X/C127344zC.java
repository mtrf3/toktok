package X;

/* renamed from: X.4zC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127344zC {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.vesdk.VERecordData r8, com.bytedance.ies.nle.editor_jni.NLEEditor r9) {
        /*
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = new com.bytedance.ies.nle.editor_jni.NLETrackSlot
            r5.<init>()
            java.lang.String r0 = r8.concatAudio
            boolean r0 = X.C78966Uyw.LJJIJIL(r0)
            java.lang.String r7 = ""
            r2 = 0
            r3 = 1
            if (r0 != 0) goto Le5
            java.lang.String r0 = r8.concatVideo
            if (r0 != 0) goto L16
            r0 = r7
        L16:
            java.util.List r0 = com.ss.android.vesdk.VEUtils.getAudioFileInfoForAllTracks(r0)
            if (r0 == 0) goto L22
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le5
        L22:
            r6 = 0
        L23:
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r4 = new com.bytedance.ies.nle.editor_jni.NLESegmentVideo
            r4.<init>()
            com.bytedance.ies.nle.editor_jni.NLEResourceAV r1 = new com.bytedance.ies.nle.editor_jni.NLEResourceAV
            r1.<init>()
            java.lang.String r0 = r8.concatVideo
            if (r0 != 0) goto Le2
        L31:
            r1.LJIIIZ(r7)
            r1.LJIJI(r6)
            r4.LJIILL(r1)
            if (r6 == 0) goto Ldf
            r0 = 1065353216(0x3f800000, float:1.0)
        L3e:
            r4.LJIL(r0)
            r5.LJIIL(r4)
            java.lang.String r0 = r8.concatAudio
            if (r0 == 0) goto L4e
            int r0 = r0.length()
            if (r0 != 0) goto Ldc
        L4e:
            r0 = 1
        L4f:
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_origin_audio_slot"
            r5.setExtra(r0, r1)
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = new com.bytedance.ies.nle.editor_jni.NLETrack
            r1.<init>()
            java.lang.String r4 = "__DEFAULT__"
            r1.setExtra(r4, r4)
            r1.LJJ(r3)
            r1.LIZIZ(r5)
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r9.LJ()
            r0.addTrack(r1)
            java.lang.String r0 = r8.concatAudio
            if (r0 == 0) goto L7b
            int r0 = r0.length()
            if (r0 != 0) goto L8f
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "initWithConcatFile -> VERecordData: "
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "VEVideoEditorMultiEditImpl"
            X.H78.LIZIZ(r0, r1)
            return
        L8f:
            X.4qa r1 = new X.4qa
            X.4qz r0 = X.EnumC122254qz.ORIGIN
            r1.<init>(r0)
            java.lang.String r0 = r8.concatAudio
            r1.LIZ = r0
            X.4qF r0 = new X.4qF
            r0.<init>(r1, r2)
            r0.LIZJ(r9)
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r9.LJ()
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r1 = r0.getTracks()
            java.lang.String r0 = "nleEditor.model.tracks"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r3 = r1.iterator()
        Lb3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lda
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.bytedance.ies.nle.editor_jni.NLENode r1 = (com.bytedance.ies.nle.editor_jni.NLENode) r1
            java.lang.String r0 = "AudioTrackType"
            java.lang.String r1 = r1.getExtra(r0)
            X.4qz r0 = X.EnumC122254qz.ORIGIN
            java.lang.String r0 = r0.name()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lb3
        Ld2:
            com.bytedance.ies.nle.editor_jni.NLENode r2 = (com.bytedance.ies.nle.editor_jni.NLENode) r2
            if (r2 == 0) goto L7b
            r2.setExtra(r4, r4)
            goto L7b
        Lda:
            r2 = 0
            goto Ld2
        Ldc:
            r0 = 0
            goto L4f
        Ldf:
            r0 = 0
            goto L3e
        Le2:
            r7 = r0
            goto L31
        Le5:
            r6 = 1
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127344zC.LIZ(com.ss.android.vesdk.VERecordData, com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.vesdk.VERecordData r26, com.bytedance.ies.nle.editor_jni.NLEEditor r27) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127344zC.LIZIZ(com.ss.android.vesdk.VERecordData, com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }
}
