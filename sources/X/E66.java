package X;

/* loaded from: classes7.dex */
public final class E66 extends E68 {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0050, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    @Override // X.E68
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(X.E67 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "dependency"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r0 = 0
            com.ss.android.ugc.aweme.plugin.IPluginService r0 = com.ss.android.ugc.aweme.plugin.PluginService.createIPluginServicebyMonsterPlugin(r0)
            java.util.List r0 = r0.getCurrentPluginListPluginData()
            java.util.Iterator r3 = r0.iterator()
        L12:
            boolean r0 = r3.hasNext()
            r8 = 1
            if (r0 == 0) goto Ld8
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r0
            int r1 = r0.id
            X.E4t r0 = X.EnumC35839E4t.TOOLTIP_PROTECTION
            int r0 = r0.getValue()
            if (r1 != r0) goto L12
        L2a:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r2 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r2
            if (r2 == 0) goto L5f
            com.ss.android.ugc.aweme.plugin.IPluginService$ShowConfig r0 = r2.showConfig
            if (r0 == 0) goto L4f
            java.lang.Boolean r0 = r0.shouldShow
            if (r0 == 0) goto L4f
            boolean r1 = r0.booleanValue()
        L3a:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r0 = r0.tooltipDataProtection
            if (r0 == 0) goto L53
            java.lang.Boolean r0 = r0.enabled
            if (r0 == 0) goto L53
            boolean r0 = r0.booleanValue()
        L4a:
            if (r1 == 0) goto L4e
            if (r0 != 0) goto L55
        L4e:
            return r8
        L4f:
            r1 = 1
            if (r2 == 0) goto L53
            goto L3a
        L53:
            r0 = 1
            goto L4a
        L55:
            if (r2 == 0) goto L5f
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r5 = r0.tooltipDataProtection
            if (r5 != 0) goto L61
        L5f:
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r5 = X.E68.LIZ
        L61:
            java.util.List<com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene> r0 = r5.tooltipPriority
            java.util.Iterator r7 = r0.iterator()
        L67:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r7.next()
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene r0 = (com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene) r0
            int r4 = r0.scene
            java.util.List<java.lang.Integer> r1 = r0.tooltips
            int r0 = r10.getScene()
            if (r4 != r0) goto La2
            java.util.Iterator r6 = r1.iterator()
            r3 = 0
        L82:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La2
            int r2 = r3 + 1
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r10.getType()
            if (r1 != r0) goto La0
            int r0 = X.E63.LIZ()
            int r0 = r0 + r3
            return r0
        La0:
            r3 = r2
            goto L82
        La2:
            java.util.List<com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene> r0 = r5.removeTooltips
            if (r0 == 0) goto L67
            java.util.Iterator r3 = r0.iterator()
        Laa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene r0 = (com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene) r0
            int r1 = r0.scene
            java.util.List<java.lang.Integer> r0 = r0.tooltips
            if (r4 != r1) goto Laa
            java.util.Iterator r2 = r0.iterator()
        Lc0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r10.getType()
            if (r1 != r0) goto Lc0
            r0 = -1
            return r0
        Ld8:
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E66.LIZ(X.E67):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0050, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    @Override // X.E68
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(X.E67 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "dependency"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r8 = 0
            com.ss.android.ugc.aweme.plugin.IPluginService r0 = com.ss.android.ugc.aweme.plugin.PluginService.createIPluginServicebyMonsterPlugin(r8)
            java.util.List r0 = r0.getCurrentPluginListPluginData()
            java.util.Iterator r3 = r0.iterator()
        L12:
            boolean r0 = r3.hasNext()
            r7 = 1
            if (r0 == 0) goto Lbf
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r0
            int r1 = r0.id
            X.E4t r0 = X.EnumC35839E4t.TOOLTIP_PROTECTION
            int r0 = r0.getValue()
            if (r1 != r0) goto L12
        L2a:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r2 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r2
            if (r2 == 0) goto L5f
            com.ss.android.ugc.aweme.plugin.IPluginService$ShowConfig r0 = r2.showConfig
            if (r0 == 0) goto L4f
            java.lang.Boolean r0 = r0.shouldShow
            if (r0 == 0) goto L4f
            boolean r1 = r0.booleanValue()
        L3a:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r0 = r0.tooltipDataProtection
            if (r0 == 0) goto L53
            java.lang.Boolean r0 = r0.enabled
            if (r0 == 0) goto L53
            boolean r0 = r0.booleanValue()
        L4a:
            if (r1 == 0) goto L4e
            if (r0 != 0) goto L55
        L4e:
            return r7
        L4f:
            r1 = 1
            if (r2 == 0) goto L53
            goto L3a
        L53:
            r0 = 1
            goto L4a
        L55:
            if (r2 == 0) goto L5f
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r5 = r0.tooltipDataProtection
            if (r5 != 0) goto L61
        L5f:
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection r5 = X.E68.LIZ
        L61:
            java.util.List<com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene> r0 = r5.tooltipPriority
            java.util.Iterator r6 = r0.iterator()
        L67:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene r0 = (com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene) r0
            int r4 = r0.scene
            int r0 = r10.getScene()
            if (r4 != r0) goto L67
            java.util.List<java.lang.Integer> r1 = r5.protection
            if (r1 == 0) goto L8a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L8a
            return r8
        L8a:
            java.util.List<com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene> r0 = r5.removeTooltips
            if (r0 == 0) goto L67
            java.util.Iterator r3 = r0.iterator()
        L92:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene r0 = (com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene) r0
            int r1 = r0.scene
            java.util.List<java.lang.Integer> r0 = r0.tooltips
            if (r4 != r1) goto L92
            java.util.Iterator r2 = r0.iterator()
        La8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r10.getType()
            if (r0 != r1) goto La8
            return r8
        Lbf:
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E66.LIZIZ(X.E67):boolean");
    }
}
